package com.example.rulesengine.model;

public class LineItem {

    private String category;
    private String yearAcquired;
    private String referenceId;
    private String description;

    public String getAcquisitionCost() {

        return acquisitionCost;
    }

    void setAcquisitionCost(final String acquisitionCost) {

        this.acquisitionCost = acquisitionCost;
    }

    private String acquisitionCost;

    public String getCategory() {

        return category;
    }

    public void setCategory(final String category) {

        this.category = category;
    }

    public String getYearAcquired() {

        return yearAcquired;
    }

    public void setYearAcquired(final String yearAcquired) {

        this.yearAcquired = yearAcquired;
    }

    public String getReferenceId() {

        return referenceId;
    }

    public void setReferenceId(final String referenceId) {

        this.referenceId = referenceId;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(final String description) {

        this.description = description;
    }
}
