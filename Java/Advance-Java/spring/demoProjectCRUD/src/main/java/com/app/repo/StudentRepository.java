package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
