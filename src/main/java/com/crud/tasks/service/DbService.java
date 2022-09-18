package com.crud.tasks.service;

import com.crud.tasks.mapper.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //tworzy konstuktor dla wszystkich pól oznaczonych jako final
public class DbService {
    //    DbService wstrzykuje do siebie klasę TaskRepository przy pomocy adnotacji @Autowired
    @Autowired
    private TaskRepository repository;

    //Wywołanie getAllTasks() z klasy DbService po prostu uruchomi findAll() z repozytorium TaskRepository.
    // Takie opakowanie zastosujemy dla sprecyzowania tego, co dokładnie się stanie po wywołaniu tej metody.
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTask(final Long taskId) throws TaskNotFoundException {
        return repository.findById(taskId).orElseThrow(TaskNotFoundException::new);
    }

    public Task saveTask(final Task task) {
        return repository.save(task);
    }

    public void deleteTask(final Long taskId) {
        repository.deleteById(taskId);
    }
}