package com.wulianfa.springdatajpademo.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_b_role")
@Data
public class Role {
    @GenericGenerator(name = "id", strategy = "uuid")
    @GeneratedValue(generator = "id")
    @Id
    private String id;

    @Column(name = "role_name", length = 100)
    private String roleName;
}
