package com.epam.training.taranovski.spring.domain;

/**
 * *********************************************************************
 * Module: Skill.java Author: Alyx Purpose: Defines the Class Skill
 * *********************************************************************
 */
import java.util.*;

/**
 * @pdOid 1021168f-033c-4784-95ce-4c1bdc571cab
 */
public class Skill {

    /**
     * @pdOid 165e32f1-bd95-49a9-97ff-1467baae0e44
     */
    private java.lang.String skillName;
    /**
     * @pdOid 57062976-09ce-4d2b-98fc-ab3cb1eb9cda
     */
    private java.lang.String description;
    /**
     * @pdOid 4a5d57c9-9dab-48ba-a61b-c97db405b532
     */
    private int experience;
    /**
     * @pdOid 409b96d9-c957-47aa-a7f8-aba0744a8c41
     */
    private int skillId;

    /**
     * @pdOid 82d904c5-6072-46cc-aa04-15f6118c5bb9
     */
    public java.lang.String getSkillName() {
        return skillName;
    }

    /**
     * @param newSkillName
     * @pdOid 751b47fc-523b-441c-8518-a6742c00cba3
     */
    public void setSkillName(java.lang.String newSkillName) {
        skillName = newSkillName;
    }

    /**
     * @pdOid 4aa61571-239e-4b4b-9f03-685d629a7c81
     */
    public java.lang.String getDescription() {
        return description;
    }

    /**
     * @param newDescription
     * @pdOid 1dd4906d-152f-4a5f-841e-3a2b0dab0b73
     */
    public void setDescription(java.lang.String newDescription) {
        description = newDescription;
    }

    /**
     * @pdOid 4627a300-f57d-4a01-954f-3d30487b3881
     */
    public int getExperience() {
        return experience;
    }

    /**
     * @param newExperience
     * @pdOid 757a6456-1f33-4ad7-9c22-c93e5f12f4f9
     */
    public void setExperience(int newExperience) {
        experience = newExperience;
    }

    /**
     * @pdOid f76dc1e4-0bc8-4ff4-bf4d-613963146a2a
     */
    public int getSkillId() {
        return skillId;
    }

    /**
     * @param newSkillId
     * @pdOid efc77512-eeaa-449b-a08c-eab90d3fd96a
     */
    public void setSkillId(int newSkillId) {
        skillId = newSkillId;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.skillName);
        hash = 97 * hash + Objects.hashCode(this.description);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Skill other = (Skill) obj;
        if (!Objects.equals(this.skillName, other.skillName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

}
