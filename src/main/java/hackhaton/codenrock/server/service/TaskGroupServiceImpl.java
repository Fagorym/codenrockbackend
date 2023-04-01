package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.TaskGroupDto;
import hackhaton.codenrock.server.repository.TaskGroupRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskGroupServiceImpl implements TaskGroupService {
    private final TaskGroupRepository taskGroupRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<TaskGroupDto> getTaskGroups(boolean isNecessary) {
        return taskGroupRepository.findAll()
                .stream()
                .filter((x) -> x.getIsNecessary() == isNecessary)
                .map((x) -> modelMapper.map(x, TaskGroupDto.class))
                .toList();
    }
}
