package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.TaskDto;
import hackhaton.codenrock.server.dto.TaskGroupDto;
import hackhaton.codenrock.server.model.Task;

import java.util.List;

public interface TaskGroupService {
    List<TaskGroupDto> getTaskGroups(boolean isNecessary);

    List<TaskDto> getTasksByGroup(Long groupId);
}
