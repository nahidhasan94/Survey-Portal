package com.cblSurveyPortal.dto;

import org.bson.types.ObjectId;

public class OfficerUpdateDTO {

    private ObjectId id;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String password;
    private String email;
    private String designation;
    private String authority;
    private String sectionId;

    public OfficerUpdateDTO() {
    }

    public OfficerUpdateDTO(ObjectId id, String firstName, String lastName, String phoneNo, String password, String email, String designation, String authority, String sectionId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.password = password;
        this.email = email;
        this.designation = designation;
        this.authority = authority;
        this.sectionId = sectionId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }
}
