package com.wulianfa.springdatajpademo;

import com.wulianfa.springdatajpademo.model.Department;
import com.wulianfa.springdatajpademo.model.Role;
import com.wulianfa.springdatajpademo.model.User;
import com.wulianfa.springdatajpademo.repository.DepartmentRepository;
import com.wulianfa.springdatajpademo.repository.EmployeeRepository;
import com.wulianfa.springdatajpademo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaDemoApplicationTests {

    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void contextLoads() {
        List<Department> all = departmentRepository.findAll();
        System.out.println(all.get(0).getEmployees().toString());
    }

}
