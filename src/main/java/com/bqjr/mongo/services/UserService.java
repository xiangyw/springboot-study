package com.bqjr.mongo.services;

import com.bqjr.mongo.entity.UserMongo;

import java.util.List;

/**
 * Created by hp on 2016/12/21.
 */
public interface UserService {
    List<UserMongo> findAll();
    void insert(UserMongo userMongo);

}
