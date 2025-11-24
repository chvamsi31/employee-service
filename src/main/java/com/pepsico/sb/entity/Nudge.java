package com.pepsico.sb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nudge")
public class Nudge {

    @Id
    @Column(name = "nudgeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nudgeId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "useremail")
    private String userEmail;

    @Column(name = "nudgetype")
    private String nudgeType;

    public Long getNudgeId() {
        return nudgeId;
    }

    public void setNudgeId(Long nudgeId) {
        this.nudgeId = nudgeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getNudgeType() {
        return nudgeType;
    }

    public void setNudgeType(String nudgeType) {
        this.nudgeType = nudgeType;
    }

    public Nudge(Long nudgeId, String productName, String userEmail, String nudgeType) {
        this.nudgeId = nudgeId;
        this.productName = productName;
        this.userEmail = userEmail;
        this.nudgeType = nudgeType;
    }

    public Nudge(){}
}