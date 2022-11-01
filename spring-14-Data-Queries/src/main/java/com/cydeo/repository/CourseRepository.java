package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //find all courses by category
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities by name
    List<Course> findByCategoryAndOrderByName(String category);

    //checks if a course with the supplied name exists. Return true if exist
    boolean findByNameExists(String name);

    //return the count of the courses for the given category
    int countByCategory(String category);

    //finds all the courses with the given course name string
    List<Course> findByNameStartingWith(String start);

    //find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);


}
