package com.epam.training.taranovski.spring.dao.domain;


/**
 * *********************************************************************
 * Module: Employer.java Author: Alyx Purpose: Defines the Class Employer
 **********************************************************************
 */

import java.util.*;

/**
 * @pdOid 119e0f9c-96dc-4b44-a584-760d6930296d
 */
public class Employer {

    /**
     * @pdOid 2f1c97ae-3a71-4bc9-92cf-b13cd6e368cb
     */
    private java.lang.String companyName;
    /**
     * @pdOid c4a7e59d-aa0d-49da-a3da-a272830af239
     */
    private java.lang.String field;
    /**
     * @pdOid c64131c4-c809-427c-98d6-eb19f8891bef
     */
    private java.lang.String adress;
    /**
     * @pdOid c29c2f49-9fb8-4d2e-b2a2-be8fd13ed41c
     */
    private double telephoneNumber;
    /**
     * @pdOid 1d8e84b8-5a18-4831-8732-fabe8407ded7
     */
    private int employerId;

    /**
     * @pdRoleInfo migr=no name=Vacancy assc=relationship3
     * coll=java.util.Collection impl=java.util.HashSet mult=0..*
     */
    public java.util.Collection<Vacancy> vacancy;
    /**
     * @pdRoleInfo migr=no name=CheckDocument assc=relationship7
     * coll=java.util.Collection impl=java.util.HashSet mult=0..*
     */
    public java.util.Collection<CheckDocument> checkDocument;

    /**
     * @pdOid 642741c9-5eb9-429d-ac56-6b8b4b59c126
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }

    /**
     * @param newCompanyName
     * @pdOid 6d246c1f-2dee-47b8-a326-7a3f8fe03610
     */
    public void setCompanyName(java.lang.String newCompanyName) {
        companyName = newCompanyName;
    }

    /**
     * @pdOid cfe41047-75f1-41a8-a299-16aa73c3a418
     */
    public java.lang.String getField() {
        return field;
    }

    /**
     * @param newField
     * @pdOid f2df2a44-a1de-40cc-bc4f-33a39d22e81c
     */
    public void setField(java.lang.String newField) {
        field = newField;
    }

    /**
     * @pdOid 4fd75693-caa8-499c-8d8b-1f8c8669d69a
     */
    public java.lang.String getAdress() {
        return adress;
    }

    /**
     * @param newAdress
     * @pdOid a15a1b4e-d024-48b2-bd52-06e0b0ec3cb1
     */
    public void setAdress(java.lang.String newAdress) {
        adress = newAdress;
    }

    /**
     * @pdOid f6396051-dbe9-43a9-92f7-19e0c38635fc
     */
    public double getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param newTelephoneNumber
     * @pdOid ca090101-b04a-4780-89aa-e1732ff6b19b
     */
    public void setTelephoneNumber(double newTelephoneNumber) {
        telephoneNumber = newTelephoneNumber;
    }

    /**
     * @pdOid 3c89dad2-36e5-413c-b9d9-2a56a944c864
     */
    public int getEmployerId() {
        return employerId;
    }

    /**
     * @param newEmployerId
     * @pdOid ecaaa280-87a4-4aef-9f42-a8dd78664a0c
     */
    public void setEmployerId(int newEmployerId) {
        employerId = newEmployerId;
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<Vacancy> getVacancy() {
        if (vacancy == null) {
            vacancy = new java.util.HashSet<Vacancy>();
        }
        return vacancy;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorVacancy() {
        if (vacancy == null) {
            vacancy = new java.util.HashSet<Vacancy>();
        }
        return vacancy.iterator();
    }

    /**
     * @pdGenerated default setter
     * @param newVacancy
     */
    public void setVacancy(java.util.Collection<Vacancy> newVacancy) {
        removeAllVacancy();
        for (java.util.Iterator iter = newVacancy.iterator(); iter.hasNext();) {
            addVacancy((Vacancy) iter.next());
        }
    }

    /**
     * @pdGenerated default add
     * @param newVacancy
     */
    public void addVacancy(Vacancy newVacancy) {
        if (newVacancy == null) {
            return;
        }
        if (this.vacancy == null) {
            this.vacancy = new java.util.HashSet<Vacancy>();
        }
        if (!this.vacancy.contains(newVacancy)) {
            this.vacancy.add(newVacancy);
        }
    }

    /**
     * @pdGenerated default remove
     * @param oldVacancy
     */
    public void removeVacancy(Vacancy oldVacancy) {
        if (oldVacancy == null) {
            return;
        }
        if (this.vacancy != null) {
            if (this.vacancy.contains(oldVacancy)) {
                this.vacancy.remove(oldVacancy);
            }
        }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllVacancy() {
        if (vacancy != null) {
            vacancy.clear();
        }
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<CheckDocument> getCheckDocument() {
        if (checkDocument == null) {
            checkDocument = new java.util.HashSet<CheckDocument>();
        }
        return checkDocument;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorCheckDocument() {
        if (checkDocument == null) {
            checkDocument = new java.util.HashSet<CheckDocument>();
        }
        return checkDocument.iterator();
    }

    /**
     * @pdGenerated default setter
     * @param newCheckDocument
     */
    public void setCheckDocument(java.util.Collection<CheckDocument> newCheckDocument) {
        removeAllCheckDocument();
        for (java.util.Iterator iter = newCheckDocument.iterator(); iter.hasNext();) {
            addCheckDocument((CheckDocument) iter.next());
        }
    }

    /**
     * @pdGenerated default add
     * @param newCheckDocument
     */
    public void addCheckDocument(CheckDocument newCheckDocument) {
        if (newCheckDocument == null) {
            return;
        }
        if (this.checkDocument == null) {
            this.checkDocument = new java.util.HashSet<CheckDocument>();
        }
        if (!this.checkDocument.contains(newCheckDocument)) {
            this.checkDocument.add(newCheckDocument);
        }
    }

    /**
     * @pdGenerated default remove
     * @param oldCheckDocument
     */
    public void removeCheckDocument(CheckDocument oldCheckDocument) {
        if (oldCheckDocument == null) {
            return;
        }
        if (this.checkDocument != null) {
            if (this.checkDocument.contains(oldCheckDocument)) {
                this.checkDocument.remove(oldCheckDocument);
            }
        }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllCheckDocument() {
        if (checkDocument != null) {
            checkDocument.clear();
        }
    }

}
