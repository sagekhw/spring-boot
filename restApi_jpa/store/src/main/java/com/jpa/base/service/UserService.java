package com.jpa.base.service;

import com.jpa.base.entity.User;
import com.jpa.base.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> readAllUser(){
        return userRepository.findAll();
    }
}
