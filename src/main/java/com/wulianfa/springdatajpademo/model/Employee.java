package com.wulianfa.springdatajpademo.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_b_emp")
@Getter
@Setter
public class Employee {

    @Id
    @GenericGenerator(name = "id", strategy = "uuid")
    @GeneratedValue(generator = "id")
    private String id;

    @Column(name = "emp_name", nullable = false, length = 64)
    private String empName;

    @Column(name = "emp_job", length = 64)
    private String empJob;

    @Column(name = "dept_id", insertable = false, updatable = false)
    private String deptId;

    @ManyToOne(targetEntity = Department.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

}