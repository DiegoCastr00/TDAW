package com.example.RestfulAPI.Repository;

import com.example.RestfulAPI.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Task, Long> {

}
