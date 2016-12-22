package com.bqjr.jpa.services.impl;

import com.bqjr.jpa.entity.GrilFriend;
import com.bqjr.jpa.entity.UserDb;
import com.bqjr.jpa.repository.GrilFriendRepository;
import com.bqjr.jpa.repository.UserDbRepository;
import com.bqjr.jpa.services.UserDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hp on 2016/12/21.
 */
@Service
public class UserDbServiceImpl implements UserDbService {
    @Autowired
    private UserDbRepository userRepository;
    @Autowired
    private GrilFriendRepository grilFriendRepository;

    public List<UserDb> findAll() {
        return userRepository.findAll();
    }

    @Transactional(propagation= Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
    public void insert(UserDb userDb) {
        userRepository.save(userDb);
        Random r=new Random();
        int size=r.nextInt(5)+2;
        for(int i=0;i<size;i++){
            GrilFriend gf=new GrilFriend();
            gf.setName("克隆"+System.currentTimeMillis());
            gf.setBwh("160,20,160");
            gf.setUserId(userDb.getId());
            grilFriendRepository.save(gf);
        }
    }
}
