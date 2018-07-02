package com.example.aqsa.exploringdagger;

/**
 * Created by Dell on 2/12/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("realTimeInformation")
    @Expose
    private RealTimeInformation realTimeInformation;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("reservedDings")
    @Expose
    private Integer reservedDings;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("deviceId")
    @Expose
    private String deviceId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("currentRole")
    @Expose
    private String currentRole;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;

    public User(String email) {
        this.email = email;
    }

    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    @SerializedName("refferalCode")
    @Expose
    private String refferalCode;

    @SerializedName("isSmsActive")
    @Expose
    private boolean isSmsActive;
    @SerializedName("smsPin")
    @Expose
    private int smsPin;
    @SerializedName("newVerifyPhone")
    @Expose
    private String newVerifyPhone;

    public String getNewVerifyPhone() {
        return newVerifyPhone;
    }

    public void setNewVerifyPhone(String newVerifyPhone) {
        this.newVerifyPhone = newVerifyPhone;
    }

    public User(String email, String verifyPhone, int a) {
        this.email = email;
        this.verifyPhone = verifyPhone;
    }

    public boolean isIsSmsActive() {

        return isSmsActive;
    }

    public void setIsSmsActive(boolean isSmsActive) {
        this.isSmsActive = isSmsActive;
    }

    public int getSmsPin() {
        return smsPin;
    }

    public void setSmsPin(int smsPin) {
        this.smsPin = smsPin;
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
    public String getRefferalCode() {
        return refferalCode;
    }

    public void setRefferalCode(String refferalCode) {
        this.refferalCode = refferalCode;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @SerializedName("companyName")
    @Expose
    private String companyName;


    @SerializedName("isDingActive")
    @Expose
    private Boolean isDingActive;

    public Boolean getIsDingActive() {
        return isDingActive;
    }

    public void setIsDingActive(Boolean isDingActive) {
        this.isDingActive = isDingActive;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }
    @SerializedName("role")
    @Expose
    private List<String> role = null;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @SerializedName("message")
    @Expose
    private String message;



    @SerializedName("addressUpdateable")
    @Expose
    private Boolean addressUpdateable;

    public Boolean getAddressUpdateable() {
        return addressUpdateable;
    }

    public void setAddressUpdateable(Boolean addressUpdateable) {
        this.addressUpdateable = addressUpdateable;
    }


    @SerializedName("addressReleased")
    @Expose
    private Boolean addressReleased;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDingActive() {
        return isDingActive;
    }

    public void setDingActive(Boolean dingActive) {
        isDingActive = dingActive;
    }


    public Boolean getAddressReleased() {
        return addressReleased;
    }

    public void setAddressReleased(Boolean addressReleased) {
        this.addressReleased = addressReleased;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(String device_id, String email,
                String role, String firstName, String lastName, String displayName,
                String phoneNum,
                String address) {

        this.deviceId = device_id;
        this.email = email;
        this.password = password;
        this.currentRole = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.address = address;
        }

    public User(String device_id, String email, String password,
                String role, String firstName, String lastName, String displayName,
                String phoneNum,
                String address) {

        this.deviceId = device_id;
        this.email = email;
        this.password = password;
        this.currentRole = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.phone = phoneNum;
        this.address = address;

    }

    @SerializedName("phone")
    @Expose
    String phone;



    @SerializedName("address")
    @Expose
    String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @SerializedName("displayName")
    @Expose
    String displayName;

    @SerializedName("position")
    @Expose
    private String position;



    public RealTimeInformation getRealTimeInformation() {
        return realTimeInformation;
    }

    public void setRealTimeInformation(RealTimeInformation realTimeInformation) {
        this.realTimeInformation = realTimeInformation;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getReservedDings() {
        return reservedDings;
    }

    public void setReservedDings(Integer reservedDings) {
        this.reservedDings = reservedDings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public User(String deviceId, String role, String firstName, String lastName, String displayName, String phone ) {

        this.deviceId = deviceId;
       // this.role = role;
        this.phone = phone;
        this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Boolean getIsActive() {
        return isActive;
    }


    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;

    @SerializedName("loc")
    @Expose
    private List<Double> loc = null;

    public List<Double> getLoc() {
        return loc;
    }

    public void setLoc(List<Double> loc) {
        this.loc = loc;
    }


}