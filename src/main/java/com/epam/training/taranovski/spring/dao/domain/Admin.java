package com.epam.training.taranovski.spring.dao.domain;

/**
 * *********************************************************************
 * Module: Admin.java Author: Alyx Purpose: Defines the Class Admin
 * *********************************************************************
 */
/**
 * @pdOid dd9387c0-6212-4911-9c8f-25adc0815248
 */
public class Admin {

    /**
     * @pdOid 029c5a4c-4713-4212-bde8-001f497f52b3
     */
    private String name;
    /**
     * @pdOid 71cfddfb-a61e-4957-a58a-13dde342011e
     */
    private int adminId;

    /**
     * @return @pdOid 64441143-5dc6-4ebf-9de5-8ef54a5e045a
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName
     * @pdOid 761032d5-d73a-4481-b978-9d2af2dc91b0
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * @return @pdOid e47b60a5-be4d-409b-a1bb-56addb5e474c
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * @param newAdminId
     * @pdOid 016e8eb4-1567-4d60-9619-c3293f26aac8
     */
    public void setAdminId(int newAdminId) {
        adminId = newAdminId;
    }

}
