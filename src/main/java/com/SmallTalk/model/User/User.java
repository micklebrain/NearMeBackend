package com.SmallTalk.model.User;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @JsonProperty
    @Column
    @Id
    private String username;

    @Column
    @JsonProperty
    private String facebookid;

    @Column
    @JsonProperty
    private String firstname;

    @Column
    @JsonProperty
    private String lastname;

    @Column
    private String lastLocation;

    @Column
    @JsonProperty
    private String school;

    @Column
    @JsonProperty
    private String sex;

    @Column
    @JsonProperty
    private String email;

    @Column
    @JsonProperty
    private Boolean online;

    @Column
    @JsonProperty
    private String locality;

//    private Date birthday;
//    private Building buildingOccupied;

    public User() {}

    public User(String facebookId, String firstname, String lastname, String school, String username, String locality, String sex, String email, Boolean online) {
        this.facebookid = facebookId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.school = school;
        this.username = username;
        this.locality = locality;
        this.sex = sex;
        this.email = email;
        this.online = online;
//        this.birthday = birthday;
//        this.buildingOccupied = buildingOccupied;
    }

    public User(String facebookId, String firstname, String lastname) {

        this.facebookid = facebookId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFacebookId() {
        return facebookid;
    }

    public void setFacebookId(String facebookId) {
        this.facebookid = facebookId;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Building getBuildingOccupied() {
//        return buildingOccupied;
//    }
//
//    public void setBuildingOccupied(Building buildingOccupied) {
//        this.buildingOccupied = buildingOccupied;
//    }

    public String getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "facebookId='" + facebookid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", school='" + school + '\'' +
                ", userName='" + username + '\'' +
                ", locality='" + locality + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", online=" + online +
//                ", birthday=" + birthday +
//                ", buildingOccupied=" + buildingOccupied +
                '}';
    }
}
