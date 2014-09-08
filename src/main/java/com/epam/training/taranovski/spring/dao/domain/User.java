package com.epam.training.taranovski.spring.dao.domain;


/**
 * *********************************************************************
 * Module: User.java Author: Alyx Purpose: Defines the Class User
 **********************************************************************
 */

import java.util.*;

/**
 * @pdOid 0ea83821-365e-453b-a298-f1fb3117961e
 */
public class User {

    /**
     * @pdOid 53e99d0a-d81a-49ab-b6d8-c1ca474185e1
     */
    private java.lang.String login;
    /**
     * @pdOid 0103b8f4-33b1-447c-a5ab-74f2c4a821b0
     */
    private java.lang.String password;
    /**
     * @pdOid cb516edf-f8b2-48cf-be3b-94fdf2d6f48f
     */
    private java.lang.String type;
    /**
     * @pdOid d55ddbb8-a8c6-4a27-ab81-c6a3acdc38f8
     */
    private int userId;
    /**
     * @pdOid 598ff3c2-6974-4b20-b9bd-4ebeeef68a7f
     */
    private int typeId;

    /**
     * @pdOid fd20a8f9-ab2d-46c7-a8dc-5e75856bcfc9
     */
    public java.lang.String getLogin() {
        return login;
    }

    /**
     * @param newLogin
     * @pdOid 479a3356-90a0-4cf1-bdba-0f1569286986
     */
    public void setLogin(java.lang.String newLogin) {
        login = newLogin;
    }

    /**
     * @pdOid d20a5209-5a4f-4d69-a671-909ee1555ec8
     */
    public java.lang.String getPassword() {
        return password;
    }

    /**
     * @param newPassword
     * @pdOid f8100821-26de-47a1-b32e-25a5f3c724fe
     */
    public void setPassword(java.lang.String newPassword) {
        password = newPassword;
    }

    /**
     * @pdOid 38e873f2-e426-4f77-b4d5-78fcbaa12226
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * @param newType
     * @pdOid af268489-b3e3-42b4-b2a5-90612ba458d5
     */
    public void setType(java.lang.String newType) {
        type = newType;
    }

    /**
     * @pdOid d0eca26d-f2ca-43b5-b72b-696a67f10ca1
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * @param newTypeId
     * @pdOid 75e1473b-f0ff-4bdd-8e7d-a55a41cef94f
     */
    public void setTypeId(int newTypeId) {
        typeId = newTypeId;
    }

    /**
     * @pdOid c4073817-f7e5-41db-b014-84ef59801eeb
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param newUserId
     * @pdOid adaaf7ef-c6b5-4f99-a80a-6a1431bf2a4e
     */
    public void setUserId(int newUserId) {
        userId = newUserId;
    }

}
