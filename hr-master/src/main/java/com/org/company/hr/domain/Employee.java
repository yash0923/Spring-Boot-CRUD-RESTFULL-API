package com.org.company.hr.domain;

import javax.persistence.*;

/**
 * Created in Eclipse IDE.
 * Project : hr-master
 * User: yash
 * Date: 18/01/2020
 */
@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private Long salary;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
