package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.TaskDto;
import hackhaton.codenrock.server.dto.TaskGroupDto;
import hackhaton.codenrock.server.model.Task;
import hackhaton.codenrock.server.model.User;
import hackhaton.codenrock.server.repository.TaskGroupRepository;
import hackhaton.codenrock.server.repository.TasksRepository;
import hackhaton.codenrock.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TaskGroupServiceImpl implements TaskGroupService {
    private final TaskGroupRepository taskGroupRepository;

    private final TasksRepository tasksRepository;

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<TaskGroupDto> getTaskGroups(boolean isNecessary) {
        User user = userRepository.findAll().get(0);
        Set<Task> completedTasks = user.getCompletedTasks();
        return taskGroupRepository.findAll()
                .stream()
                .filter((x) -> x.getIsNecessary() == isNecessary)
                .map((x) -> modelMapper.map(x, TaskGroupDto.class))
                .peek((x) -> x.setActualCount(
                        completedTasks.stream()
                                .filter(y -> Objects.equals(x.getId(), y.getGroup().getId()))
                                .count()))
                .toList();
    }

    @Override
    public List<TaskDto> getTasksByGroup(Long groupId) {
        User user = userRepository.findAll().get(0);
        return tasksRepository.getTasks(groupId)
                .stream()
                .map((x) -> {
                    TaskDto dto = modelMapper.map(x, TaskDto.class);
                    dto.setCompleted(user.getCompletedTasks().contains(x));
                    return dto;
                })
                .toList();
    }
}
