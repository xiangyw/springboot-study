package com.bqjr.jpa.repository;

import com.bqjr.jpa.entity.GrilFriend;
import com.bqjr.jpa.entity.UserDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 2016/12/22.
 */
@Repository
public interface GrilFriendRepository extends JpaRepository<GrilFriend, Long>{

}
