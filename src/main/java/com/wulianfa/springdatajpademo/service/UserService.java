package com.wulianfa.springdatajpademo.service;

import com.wulianfa.springdatajpademo.model.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> findAll(int currentPage, int pageSize);
}
