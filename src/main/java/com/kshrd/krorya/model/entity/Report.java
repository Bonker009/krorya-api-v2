package com.kshrd.krorya.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    private UUID reportId;
    private UUID recipeId;
    private UUID reporterId;
    private UUID reporteeId;
    private String description;
    private Date reportDate;
    private String reportType;
}
