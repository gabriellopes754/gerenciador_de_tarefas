package com.gabriel.gerenciadortarefas.service;

import com.gabriel.gerenciadortarefas.model.Task;
import com.gabriel.gerenciadortarefas.repository.TaskRepository;
import com.gabriel.gerenciadortarefas.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @Mock
    private TaskRepository repository;

    @InjectMocks
    private TaskService service;

    @Test
    void deveListarTodasAsTarefas() {

        Task task = new Task();
        task.setTitulo("Estudar Engenharia de Software");

        when(repository.findAll()).thenReturn(List.of(task));

        List<Task> tarefas = service.listarTodas();

        assertEquals(1, tarefas.size());
        assertEquals("Estudar Engenharia de Software", tarefas.get(0).getTitulo());
    }
}