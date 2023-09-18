package com.paisakarobar.user.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.time.LocalDate;
import java.util.UUID;

@MappedEntity(schema = "public")
public class UserEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String userName;
    private String fullName;
    private String email;
    private String password;
    private String citizenship;
    private String userRole;
    private LocalDate createdAt;
    private String statusByAdmin;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatusByAdmin() {
        return statusByAdmin;
    }

    public void setStatusByAdmin(String statusByAdmin) {
        this.statusByAdmin = statusByAdmin;
    }

    public UserEntity(UUID id, String userName, String fullName,
                      String email, String password, String citizenship,
                      String userRole, LocalDate createdAt, String statusByAdmin) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.citizenship = citizenship;
        this.userRole = userRole;
        this.createdAt = createdAt;
        this.statusByAdmin = statusByAdmin;
    }

    public UserEntity(){}
}
