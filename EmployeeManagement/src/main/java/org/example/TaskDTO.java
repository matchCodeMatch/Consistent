package org.example;

import lombok.Data;

@Data
public class TaskDTO {
    private Long taskId;
    private String taskName;
    private String projectName;
    private String employeeName;
    private Status taskStatus;
}
