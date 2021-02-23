package com.facility.model.use;

public class FacilityUser {
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public FacilityUser(String userId, String firstName, String lastName, String phoneNumber,
                        String address){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUserId(){ return userId; }

    public void setUserID(String userId){ this.userId = userId; }

    public String getFirstName(){ return firstName; }

    public void setFirstName(String firstName){ this.firstName = firstName; }

    public String getLastName(){ return lastName;}

    public void setLastName(String lastName){ this.lastName = lastName; }

    public String getPhoneNumber(){ return phoneNumber; }

    public void setPhoneNumber(String phoneNumber){ this.phoneNumber = phoneNumber; }

    public String getAddress(){ return address; }

    public void setAddress(String address){ this.address = address; }

//    public String toString(){
//        String result = "";
//        result = "User Name: " + this.firstName + " " + this.lastName;
//        result += "/n"+ "Address: " + this.address;
//        result += "/n"+ "Phone Number: " + this.phoneNumber;
//
//        return result;
//    }

}
