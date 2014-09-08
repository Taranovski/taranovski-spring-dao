package com.epam.training.taranovski.spring.domain;

/**
 * *********************************************************************
 * Module: CheckDocument.java Author: Alyx Purpose: Defines the Class
 * CheckDocument
 * *********************************************************************
 */
/**
 * @pdOid 82a10cc6-60b5-4fdd-83a4-ec7da34adfa7
 */
public class CheckDocument {

    /**
     * @pdOid 9b6030e7-570e-400c-a989-4f33c18c7bb6
     */
    private double commissions;
    /**
     * @pdOid 042d3a6b-070e-47a0-b114-df75c35cfd46
     */
    private int checkDocumentId;

    /**
     * @return @pdOid ea6020d9-de20-45e2-bf4e-f5be387e61e6
     */
    public double getCommissions() {
        return commissions;
    }

    /**
     * @param newCommissions
     * @pdOid 626fcfcd-c088-4339-8aa8-e007efbabde3
     */
    public void setCommissions(double newCommissions) {
        commissions = newCommissions;
    }

    /**
     * @return @pdOid fdca3915-fa36-4213-a0ef-29c53dff25ec
     */
    public int getCheckDocumentId() {
        return checkDocumentId;
    }

    /**
     * @param newCheckDocumentId
     * @pdOid 26995da4-1202-4120-88e6-ebc0893fbff1
     */
    public void setCheckDocumentId(int newCheckDocumentId) {
        checkDocumentId = newCheckDocumentId;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.commissions) ^ (Double.doubleToLongBits(this.commissions) >>> 32));
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
        final CheckDocument other = (CheckDocument) obj;
        if (Double.doubleToLongBits(this.commissions) != Double.doubleToLongBits(other.commissions)) {
            return false;
        }
        return true;
    }

}
