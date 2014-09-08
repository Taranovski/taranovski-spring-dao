package com.epam.training.taranovski.spring.dao.domain;


/**
 * *********************************************************************
 * Module: Vacancy.java Author: Alyx Purpose: Defines the Class Vacancy
 **********************************************************************
 */

import java.util.*;

/**
 * @pdOid 6a9aa917-27ac-47d3-b038-6390d47a47be
 */
public class Vacancy {

    /**
     * @pdOid f76f883c-64cf-4757-be18-0259fc92f03a
     */
    private java.lang.String position;
    /**
     * @pdOid d2fbc2c8-b5d1-4e4d-9691-7a9ea70a8a20
     */
    private double salary;
    /**
     * @pdOid d6697155-9d4b-4603-bf9e-5ab4cbf58ddb
     */
    private java.lang.String description;
    /**
     * @pdOid 88263614-2af1-49fc-b17f-812673ec247f
     */
    private int vacancyId;

    /**
     * @pdRoleInfo migr=no name=Skill assc=relationship2
     * coll=java.util.Collection impl=java.util.HashSet mult=0..*
     */
    public java.util.Collection<Skill> skill;

    /**
     * @pdOid 4af9a3b6-3e87-4cdc-b8b0-50df33aa56d3
     */
    public java.lang.String getPosition() {
        return position;
    }

    /**
     * @param newPosition
     * @pdOid c2b7ef42-c6f4-4ef2-aeaf-b0afd9292756
     */
    public void setPosition(java.lang.String newPosition) {
        position = newPosition;
    }

    /**
     * @pdOid c9781487-204e-4a23-bf24-ac93eedc9f57
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param newSalary
     * @pdOid a9a70224-e2ee-4785-9603-af1123443dd9
     */
    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    /**
     * @pdOid 391b3a6b-bc62-46f4-b075-4f17c6b49812
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * @param newDescription
     * @pdOid 2d956fed-ff15-4acc-9102-ec1b19d6f05b
     */
    public void setDescription(java.lang.String newDescription) {
        description = newDescription;
    }

    /**
     * @pdOid 73446bdd-d527-4dc1-a857-9bc758ccb5f4
     */
    public int getVacancyId() {
        return vacancyId;
    }

    /**
     * @param newVacancyId
     * @pdOid f7b17f88-c37b-4853-9987-7b8e624e8b8c
     */
    public void setVacancyId(int newVacancyId) {
        vacancyId = newVacancyId;
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<Skill> getSkill() {
        if (skill == null) {
            skill = new java.util.HashSet<Skill>();
        }
        return skill;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorSkill() {
        if (skill == null) {
            skill = new java.util.HashSet<Skill>();
        }
        return skill.iterator();
    }

    /**
     * @pdGenerated default setter
     * @param newSkill
     */
    public void setSkill(java.util.Collection<Skill> newSkill) {
        removeAllSkill();
        for (java.util.Iterator iter = newSkill.iterator(); iter.hasNext();) {
            addSkill((Skill) iter.next());
        }
    }

    /**
     * @pdGenerated default add
     * @param newSkill
     */
    public void addSkill(Skill newSkill) {
        if (newSkill == null) {
            return;
        }
        if (this.skill == null) {
            this.skill = new java.util.HashSet<Skill>();
        }
        if (!this.skill.contains(newSkill)) {
            this.skill.add(newSkill);
        }
    }

    /**
     * @pdGenerated default remove
     * @param oldSkill
     */
    public void removeSkill(Skill oldSkill) {
        if (oldSkill == null) {
            return;
        }
        if (this.skill != null) {
            if (this.skill.contains(oldSkill)) {
                this.skill.remove(oldSkill);
            }
        }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllSkill() {
        if (skill != null) {
            skill.clear();
        }
    }

}
