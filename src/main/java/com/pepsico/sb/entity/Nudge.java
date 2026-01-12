package com.pepsico.sb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nudge")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}