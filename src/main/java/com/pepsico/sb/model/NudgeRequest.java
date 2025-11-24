package com.pepsico.sb.model;

import java.math.BigDecimal;

public class NudgeRequest {

    private String userEmail;
    private String productName;
    private String nudgeType;

    public NudgeRequest(String userEmail, String productName, String nudgeType) {
        this.userEmail = userEmail;
        this.productName = productName;
        this.nudgeType = nudgeType;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNudgeType() {
        return nudgeType;
    }

    public void setNudgeType(String nudgeType) {
        this.nudgeType = nudgeType;
    }

    public NudgeRequest() {}

}