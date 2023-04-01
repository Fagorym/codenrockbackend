package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.TaskDto;
import hackhaton.codenrock.server.dto.TaskGroupDto;
import hackhaton.codenrock.server.model.Task;
import hackhaton.codenrock.server.repository.TaskGroupRepository;
import hackhaton.codenrock.server.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskGroupServiceImpl implements TaskGroupService {
    private final TaskGroupRepository taskGroupRepository;

    private final TasksRepository tasksRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<TaskGroupDto> getTaskGroups(boolean isNecessary) {
        return taskGroupRepository.findAll()
                .stream()
                .filter((x) -> x.getIsNecessary() == isNecessary)
                .map((x) -> modelMapper.map(x, TaskGroupDto.class))
                .toList();
    }

    @Override
    public List<TaskDto> getTasksByGroup(Long groupId) {
        return tasksRepository.getTasks(groupId)
                .stream()
                .map((x) -> modelMapper.map(x, TaskDto.class))
                .toList();
    }
}
