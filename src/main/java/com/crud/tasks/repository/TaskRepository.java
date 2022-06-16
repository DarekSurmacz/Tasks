package com.crud.tasks.repository;

import com.crud.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    //CrudRepository udostępnia metody oraz logikę pobierania danych z bazy
    // <obiekt, który będziemy pobierać, typ numeru identyfikacyjnego>
    @Override
    //nadpisujemy metodę, oryginalnie zwraca typ Iterable<T> , wolimy List<Task>
    List<Task> findAll();
}