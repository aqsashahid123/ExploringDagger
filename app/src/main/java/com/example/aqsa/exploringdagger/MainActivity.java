package com.example.aqsa.exploringdagger;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    BaseComponent component;
    Retrofit retrofit;

    boolean succes = false;
    //ProgressDialog dialog;
    String emailId;
    EditText etEmailId;
    List<Double> locList;
    Button btnSubmit;
    @Inject
    NetworkApiInterface apiService;
    @Inject
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        locList = new ArrayList<>();
        locList.add(31.478051);
        locList.add(31.478051);
        etEmailId = (EditText) findViewById(R.id.etEmailAddress);
        btnSubmit.setOnClickListener(this);
        component = DaggerBaseComponent.builder()
                .networkModule(new NetworkModule()).retroModule(new RetroModule())
                .contextModule(new ContextModule(MainActivity.this))
                .networkServiceApiModule(new NetworkServiceApiModule())
                .build();
        component.injectActivity(this);

    }

    //
    public String signUpRealtimeAccount(RootUserModel user) {

//        dialog.setMessage("loading");
//        dialog.show();
        Call<RootUserModel> call = apiService.userSignUpRealtimeAccount(user);
        call.enqueue(new retrofit2.Callback<RootUserModel>() {
            @Override
            public void onResponse(Call<RootUserModel> call, Response<RootUserModel> response) {
                try {
//                    dialog.dismiss();
                    if (response.isSuccessful()) {
                        if (response != null) {
                            if (response.body() != null) {
  //                                 ToastGenerator.generateToast(context, String.valueOf(response.body().getStatus().getMessage()));
                                if (response.body().getStatus().getCode().equals(200)) {
                                    succes = true;
                                    Body userModelBody = response.body().getBody();
                                    User userModel = userModelBody.getUser();
                                    Intent intent = new Intent(MainActivity.this, PinVerificationActivity.class);
                                    intent.putExtra("email", userModel.getEmail());
                                    intent.putExtra("requestFocusFlag", true);
                                    intent.putExtra("role", userModel.getCurrentRole());
                                    intent.putExtra("verifyPhone", userModel.getVerifyPhone());
                                    intent.putExtra("isFromSignup", true);
                                    startActivity(intent);
                                    finish();

                                    Log.e("Token", response.body().getBody().getToken());
                                }
                            }
                        }
                    } else {
                        if (response != null && response.errorBody() != null) {
//                            dialog.dismiss();
                            JSONObject jsonObject = new JSONObject(response.errorBody().string());
                            String error = jsonObject.getString("msg");
                        }
                    }
                } catch (Exception e) {

                    Log.e("ErrorLoginApi:", e + "");
                }
            }

            @Override
            public void onFailure(Call<RootUserModel> call, Throwable t) {
//                dialog.dismiss();
                Log.e("ErrorLoginApi:", t.toString());
            }
        });
        if (succes){
            return "sucess";
        }
        else {
            return "FAILURE";
        }

    }

    @Override
    public void onClick(View v) {
        if (v == btnSubmit) {
            RootUserModel user = new RootUserModel("123",
                    etEmailId.getText().toString(), "demo456",
                    "realtime", "fName", "lastName", "displayName",
                    "03211942343", " ", "", locList, "+923211942343");
            signUpRealtimeAccount(user);
        }
    }
}
