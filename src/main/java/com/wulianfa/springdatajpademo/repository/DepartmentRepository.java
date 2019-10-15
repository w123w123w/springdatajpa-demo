package com.wulianfa.springdatajpademo.repository;

import com.wulianfa.springdatajpademo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
