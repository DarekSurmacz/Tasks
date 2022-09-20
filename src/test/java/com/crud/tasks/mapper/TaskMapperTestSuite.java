package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaskMapperTestSuite {

    private TaskMapper taskMapper;

    @BeforeEach
    void before() {
        taskMapper = new TaskMapper();
    }

    @Test
    void mapToTaskTest() {
        //Given
        TaskDto taskDto = new TaskDto(1L, "test_title", "test_content");
        //When
        Task task = taskMapper.mapToTask(taskDto);
        //Then
        assertNotNull(task.getId());
        assertEquals("test_title", task.getTitle());
        assertEquals("test_content", task.getContent());
    }

    @Test
    void mapToTaskDtoTest() {
        //Given
        Task task = new Task(1L, "test_title", "test_content");
        //When
        TaskDto taskDto = taskMapper.mapToTaskDto(task);
        //Then
        assertNotNull(taskDto.getId());
        assertEquals("test_title", taskDto.getTitle());
        assertEquals("test_content", taskDto.getContent());
    }

    @Test
    void mapToTaskDtoList() {
        //Given
        Task task = new Task(1L, "test_title", "test_content");
        List<Task> tasks = new ArrayList<>();
        tasks.add(task);
        //When
        List<TaskDto> taskDtoList = taskMapper.mapToTaskDtoList(tasks);
        //Then
        assertEquals(1, taskDtoList.size());
        assertEquals("test_title", tasks.get(0).getTitle());
        assertEquals("test_content", taskDtoList.get(0).getContent());
        assertNotNull(taskDtoList.get(0).getId());
    }
}