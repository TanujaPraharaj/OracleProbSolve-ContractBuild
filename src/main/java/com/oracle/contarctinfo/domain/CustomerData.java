package com.oracle.contarctinfo.domain;

public class CustomerData {
    private String customerId;
    private String contractId;
    private String geozone;
    private String teamcode;
    private String projectcode;
    private int buildduration;

    public CustomerData(String customerId, String contractId, String geozone, String teamcode, String projectcode, int buildduration) {
        this.customerId = customerId;
        this.contractId = contractId;
        this.geozone = geozone;
        this.teamcode = teamcode;
        this.projectcode = projectcode;
        this.buildduration = buildduration;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public String getGeozone() {
        return geozone;
    }

    public String getTeamcode() {
        return teamcode;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public int getBuildduration() {
        return buildduration;
    }
}
