package com.wulianfa.springdatajpademo.service.impl;

import com.wulianfa.springdatajpademo.model.User;
import com.wulianfa.springdatajpademo.repository.UserRepository;
import com.wulianfa.springdatajpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findAll(int currentPage, int pageSize) {
        //方式一：
        //PageRequest pageRequest = PageRequest.of(currentPage, pageSize, Sort.Direction.DESC, "id");
        //方式二：
        PageRequest pageRequest = PageRequest.of(currentPage, pageSize, Sort.by(Sort.Direction.ASC, "id"));
        return userRepository.findAll(pageRequest);
    }
}
