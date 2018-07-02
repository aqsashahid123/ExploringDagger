package com.example.aqsa.exploringdagger;

/**
 * Created by Dell on 2/12/2018.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootUserModel {

    @SerializedName("status")
    @Expose
    private Status status;

    public RootUserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @SerializedName("body")

    @Expose
    private Body body;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("deviceId")
    @Expose
    String deviceId;
    @SerializedName("newVerifyPhone")
    @Expose
    private String newVerifyPhone;

    public String getNewVerifyPhone() {
        return newVerifyPhone;
    }

    public void setNewVerifyPhone(String newVerifyPhone) {
        this.newVerifyPhone = newVerifyPhone;
    }
    public RootUserModel(String device_id, String role , String fName, String lName, String num, String address,
                         String companyName, String position, String nameOfDisplay,
                         Boolean termsAndConditions, int i, List<Double> loc, String verifyPhone) {

   this.deviceId = device_id;
   this.firstName=fName;
   this.lastName =lName;
   this.phone = num;
   this.address = address;
   this.company = companyName;
   this.position = position;
   this.displayName = nameOfDisplay;
   this.role = role;
   this.loc = loc;
   this.verifyPhone= verifyPhone;

    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Body getBody() {
        return body;
    }

    public RootUserModel(String newVerifyPhone, String email, String role, int smsPin) {
        this.newVerifyPhone = newVerifyPhone;
        this.email = email;
        this.role = role;
        this.smsPin = smsPin;
    }

    public void setBody(Body body) {
        this.body = body;
    }


    @SerializedName("email")
    @Expose
    String email;
    @SerializedName("password")
    @Expose
    String password;
    @SerializedName("role")
    @Expose
    String role;
    @SerializedName("firstName")
    @Expose
    String firstName;
    @SerializedName("lastName")
    @Expose
    String lastName;
    @SerializedName("displayName")
    @Expose
    String displayName;
    @SerializedName("phone")
    @Expose
    String phone;

    @SerializedName("address")
    @Expose
    String address;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @SerializedName("company")
    @Expose
    String company;

    @SerializedName("position")
    @Expose
    String position;

    public RootUserModel(String email, String firstName, String lastName, String phone, String message) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.message = message;
    }
    public RootUserModel(String currentRole){
        this.currentRole = currentRole;

    }
    public RootUserModel(String email, int a, int c){
        this.email = email;

    }

    public boolean isSmsActive() {
        return isSmsActive;
    }

    public void setSmsActive(boolean smsActive) {
        isSmsActive = smsActive;
    }

    public int getSmsPin() {
        return smsPin;
    }

    public void setSmsPin(int smsPin) {
        this.smsPin = smsPin;
    }

    @SerializedName("isSmsActive")
    @Expose
    private boolean isSmsActive;
    @SerializedName("smsPin")
    @Expose
    private int smsPin;


    @SerializedName("currentRole")
    @Expose
    private String currentRole;

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }
    public RootUserModel(String deviceId, String email, String password, String role,
                         String firstName, String lastName, String displayName, String phone,
                         String address, String companyName, String position, String refferedBy, List<Double> loc, String verifyPhone) {
        this.deviceId = deviceId;
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phone;
        this.address = address;
        this.company = companyName;
        this.position = position;
        this.refferedBy = refferedBy;
        this.loc = loc;
        this.verifyPhone = verifyPhone;
    }

    public RootUserModel(String deviceId, String email, String role, String firstName,
                         String lastName, String displayName, String phone, String address) {
        this.deviceId = deviceId;
        this.email = email;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phone;
        this.address = address;
    }

    @SerializedName("refferedBy")
    @Expose
    private String refferedBy;

    public String getRefferedBy() {
        return refferedBy;
    }

    public void setRefferedBy(String refferedBy) {
        this.refferedBy = refferedBy;
    }


    public RootUserModel(String deviceId, String email, String currentRole, String firstName,
                         String lastName, String displayName, String phone, String address, int b,
                         int c, List<Double> loc) {       //accountUpdation
        this.deviceId = deviceId;
        this.email = email;
        this.currentRole = currentRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phone;
        this.address = address;
        this.loc = loc;
    }

    public RootUserModel(String deviceId, String email, String currentRole, String firstName,
                         String lastName, String displayName, String phone, int b, int c) {       //accountUpdation Without Address
        this.deviceId = deviceId;
        this.email = email;
        this.currentRole = currentRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phone;

     //   this.address = address;
    }

    public RootUserModel(String email, int smsPin, String role) {
        this.email = email;
        this.smsPin = smsPin;
        this.role = role;
    }

    ///addPersonalAccount
    public RootUserModel(String deviceId, String role, String firstName, String lastName,
                         String displayName, String phone, String address, int i, List<Double> loc, String verifyPhone) {
        this.deviceId = deviceId;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phone;
        this.address = address;
        this.loc = loc;
        this.verifyPhone = verifyPhone;
    }



    public RootUserModel(String device_id,
                         String role, String firstName, String lastName, String displayName,
                         String phoneNum) {

        this.deviceId = device_id;

        this.currentRole = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;

    }





    public RootUserModel(String device_id, String email, String password,
                         String role, String firstName, String lastName, String displayName,
                         String phoneNum,
                         String address, String refferedBy, List<Double> loc) {

        this.deviceId = device_id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.address = address;
        this.refferedBy = refferedBy;
        this.loc = loc;
    }

    public RootUserModel(String device_id, String email, String password,
                         String role, String firstName, String lastName, String displayName,
                         String phoneNum,
                         String address, String refferedBy, List<Double> loc, String verifyPhone) {

        this.deviceId = device_id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.address = address;
        this.refferedBy = refferedBy;
        this.loc = loc;
        this.verifyPhone= verifyPhone;
    }





    public RootUserModel(String device_id,
                         String role, String firstName, String lastName, String displayName,
                         String phoneNum, int a, String verifyPhone) {

        this.deviceId = device_id;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.verifyPhone = verifyPhone;


    }





    public RootUserModel(String device_id, String email,
                         String currentRole, String firstName, String lastName, String displayName,
                         String phoneNum,
                         String address, String companyName, String position, int i, List<Double> loc, String verifyPhone) {

        this.deviceId = device_id;
        this.email = email;
        this.currentRole = currentRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.address = address;
        this.company = companyName;
        this.position = position;
        this.loc = loc;
        this.verifyPhone= verifyPhone;

    }


    public RootUserModel(String device_id, String email,
                         String currentRole, String firstName, String lastName, String displayName,
                         String phoneNum,
                         String companyName, String position, int i, String verifyPhone) {

        this.deviceId = device_id;
        this.email = email;

        this.currentRole = currentRole;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.company = companyName;
        this.position = position;
        this.verifyPhone = verifyPhone;

    }

    public RootUserModel(String email, String password,
                         String role, String firstName, String lastName, String displayName,
                         String phoneNum, String refferedBy, List<Double> locationList, String address, String deviceId, int a) {

        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.refferedBy = refferedBy;
        this.loc = locationList;
        this.address = address;
        this.deviceId = deviceId;
    }



    @SerializedName("refferalCode")
    @Expose
    private String refferalCode;

    public String getRefferalCode() {
        return refferalCode;
    }

    public void setRefferalCode(String refferalCode) {
        this.refferalCode = refferalCode;
    }



    @SerializedName("addressUpdateable")
    @Expose
    private Boolean addressUpdateable;

    @SerializedName("addressReleased")
    @Expose
    private Boolean addressReleased;

    public Boolean getAddressUpdateable() {
        return addressUpdateable;
    }

    public void setAddressUpdateable(Boolean addressUpdateable) {
        this.addressUpdateable = addressUpdateable;
    }

    public Boolean getAddressReleased() {
        return addressReleased;
    }

    public void setAddressReleased(Boolean addressReleased) {
        this.addressReleased = addressReleased;
    }
    @SerializedName("loc")
    @Expose
    private List<Double> loc = null;

    public List<Double> getLoc() {
        return loc;
    }

    public void setLoc(List<Double> loc) {
        this.loc = loc;
    }
    @SerializedName("verifyPhone")
    @Expose
    private String verifyPhone;

    public String getVerifyPhone() {
        return verifyPhone;
    }

    public void setVerifyPhone(String verifyPhone) {
        this.verifyPhone = verifyPhone;
    }

}
