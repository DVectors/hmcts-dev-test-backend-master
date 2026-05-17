package uk.gov.hmcts.reform.dev.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.dev.models.enums.TaskStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskModel {
    private int taskId;
    private String taskName;
    private String taskDescription;
    private TaskStatus taskStatus;
    private String taskAssignee;

}
