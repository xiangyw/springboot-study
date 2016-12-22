package com.bqjr.mongo.services.impl;

import com.bqjr.mongo.entity.UserMongo;
import com.bqjr.mongo.repository.UserRepository;
import com.bqjr.mongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hp on 2016/12/21.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public List<UserMongo> findAll() {
        return userRepository.findAll();
    }

    public void insert(UserMongo userMongo) {
        userRepository.save(userMongo);
    }
}
