package com.epam.training.taranovski.spring.domain;


/**
 * *********************************************************************
 * Module: Employee.java Author: Alyx Purpose: Defines the Class Employee
 **********************************************************************
 */

import java.util.*;

/**
 * @pdOid f8ee4325-beab-4ef8-8c43-718db6665714
 */
public class Employee {

    /**
     * @pdOid 49a0cd74-7b8e-4c9a-89e7-3af0373c4c51
     */
    private java.lang.String name;
    /**
     * @pdOid a9611d09-3471-4f57-bead-e1e4f1d1ee9c
     */
    private java.lang.String surname;
    /**
     * @pdOid 12d1e95b-9cb5-4db4-ad6b-a077b7ca96af
     */
    private java.lang.String patronymic;
    /**
     * @pdOid fdfb6465-42a4-4cae-87de-8ea18ac7be62
     */
    private java.lang.String qualification;
    /**
     * @pdOid a2c12036-bb41-498f-9122-33d95c87ebd2
     */
    private java.lang.String occupation;
    /**
     * @pdOid b26ed468-cbf6-423c-ba01-e2341bb9d3d8
     */
    private int employeeId;

    /**
     * @pdRoleInfo migr=no name=Skill assc=relationship4
     * coll=java.util.Collection impl=java.util.HashSet mult=0..*
     */
    public java.util.Collection<Skill> skill;

    /**
     * @pdOid c56f8431-7128-41c5-a203-346f1d3c74db
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @param newName
     * @pdOid 5de04d09-56f6-4677-906b-e6886fd97250
     */
    public void setName(java.lang.String newName) {
        name = newName;
    }

    /**
     * @pdOid dce9d058-53e5-4b35-91dd-d98bbc642b38
     */
    public java.lang.String getSurname() {
        return surname;
    }

    /**
     * @param newSurname
     * @pdOid 1a5cc807-5b44-4bd4-a199-a319557ea9c4
     */
    public void setSurname(java.lang.String newSurname) {
        surname = newSurname;
    }

    /**
     * @pdOid 22f5701d-45f1-4c69-be87-e465d98a2e64
     */
    public java.lang.String getPatronymic() {
        return patronymic;
    }

    /**
     * @param newPatronymic
     * @pdOid bfed1e2b-0874-448a-9b2b-4aa1d7eea86e
     */
    public void setPatronymic(java.lang.String newPatronymic) {
        patronymic = newPatronymic;
    }

    /**
     * @pdOid 6321e4a9-1e61-4337-af84-4bcb400a2a71
     */
    public java.lang.String getQualification() {
        return qualification;
    }

    /**
     * @param newQualification
     * @pdOid 516c96d0-b52e-4f34-ac8f-fd4793f170eb
     */
    public void setQualification(java.lang.String newQualification) {
        qualification = newQualification;
    }

    /**
     * @pdOid da9f6858-77b4-4333-a6ea-bebe0237f652
     */
    public java.lang.String getOccupation() {
        return occupation;
    }

    /**
     * @param newOccupation
     * @pdOid 98478b8f-7c4d-47b2-a414-647e4e4ebd8d
     */
    public void setOccupation(java.lang.String newOccupation) {
        occupation = newOccupation;
    }

    /**
     * @pdOid 6d99daab-fd17-4253-8e5d-f1b13158bb65
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param newEmployeeId
     * @pdOid 6ff51570-8731-45f1-a920-820e8c778f28
     */
    public void setEmployeeId(int newEmployeeId) {
        employeeId = newEmployeeId;
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
