package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.cache.spi.SecondLevelCacheLogger;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //display all employees with email address ""
    List<Employee> findByEmail(String email);

    //display all employees with firstName "" and lastname ""
    //also show all employees with a email address
    List<Employee> findByFirstNameAndAndLastNameOOrAndEmail(String firstName, String lastName, String email);


    //display all emails that first name is not ""
    List<Employee> findByFirstNameIsNot(String notContaining);


    //display all employees where lastname starts with ""
    List<Employee> findByLastNameStartingWith(String start);

    //Display all employees with salaries higher than ""
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate ending);

    //Display all employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email= ' ' ")
    Employee retrieveEmployeeDetail();
    @Query("SELECT e.salary from Employee e where e.email= ' ' ")
    Integer retrieveEmployeeSalary();
}
