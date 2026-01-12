package com.pepsico.sb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NudgeRequest {

    private String userEmail;
    private String productName;
    private String nudgeType;
}