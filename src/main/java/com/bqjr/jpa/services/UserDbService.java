package com.bqjr.jpa.services;

import com.bqjr.jpa.entity.UserDb;
import com.bqjr.mongo.entity.UserMongo;

import java.util.List;

/**
 * Created by hp on 2016/12/21.
 */
public interface UserDbService {
    List<UserDb> findAll();
    void insert(UserDb userDb);

}
