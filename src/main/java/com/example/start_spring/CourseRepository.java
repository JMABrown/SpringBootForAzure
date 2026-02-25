package com.example.start_spring;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {

}