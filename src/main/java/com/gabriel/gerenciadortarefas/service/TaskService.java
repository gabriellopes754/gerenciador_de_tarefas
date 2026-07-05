package com.gabriel.gerenciadortarefas.service;

import com.gabriel.gerenciadortarefas.model.Task;
import com.gabriel.gerenciadortarefas.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> listarTodas() {
        return repository.findAll();
    }

    public Optional<Task> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Task salvar(Task task) {
        return repository.save(task);
    }

    public Task atualizar(Long id, Task task) {
        task.setId(id);
        return repository.save(task);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}