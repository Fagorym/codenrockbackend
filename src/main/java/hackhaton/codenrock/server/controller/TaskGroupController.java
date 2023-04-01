package hackhaton.codenrock.server.controller;

import hackhaton.codenrock.server.dto.TaskDto;
import hackhaton.codenrock.server.dto.TaskGroupDto;
import hackhaton.codenrock.server.model.Task;
import hackhaton.codenrock.server.service.TaskGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "api/v2/tasks")
@RequiredArgsConstructor
@RestController
public class TaskGroupController {
    private final TaskGroupService taskGroupService;

    @GetMapping
    public List<TaskGroupDto> getNecessary() {
        return taskGroupService.getTaskGroups(true);
    }

    @GetMapping(value = "additional")
    public List<TaskGroupDto> getAdditional() {
        return taskGroupService.getTaskGroups(false);
    }

    @GetMapping(value = "/group")
    public List<TaskDto> getTasksByGroup(@RequestParam Long groupId) {
        return taskGroupService.getTasksByGroup(groupId);

    }
}
