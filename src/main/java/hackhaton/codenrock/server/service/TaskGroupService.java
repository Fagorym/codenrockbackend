package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.TaskGroupDto;

import java.util.List;

public interface TaskGroupService {
    List<TaskGroupDto> getTaskGroups(boolean isNecessary);
}
