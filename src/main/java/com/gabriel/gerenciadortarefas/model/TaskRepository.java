package com.gabriel.gerenciadortarefas.repository;

import com.gabriel.gerenciadortarefas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}