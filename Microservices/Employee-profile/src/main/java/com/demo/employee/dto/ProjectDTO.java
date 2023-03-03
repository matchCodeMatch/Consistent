package com.demo.employee.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProjectDTO {
    private enum Status{
        NOT_STARTED, IN_PROGRESS, COMPLETED, CANCELLED
    }
    private String projectId;
    private String projectTitle;
    private Status projectStatus;
    private LocalDate projectStartDate;
    private LocalDate projectDeadLine;
    private LocalDate projectEndDate;
}
