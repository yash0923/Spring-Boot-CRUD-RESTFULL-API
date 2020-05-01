package com.org.company.hr.repository;
/**
 * Created in Eclipse IDE.
 * Project : hr-master
 * User: yash
 * Date: 18/01/2020
 */
import com.org.company.hr.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
    @Override
    Optional<Employee> findById(Long integer);
}
