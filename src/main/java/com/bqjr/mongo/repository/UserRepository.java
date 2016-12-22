package com.bqjr.mongo.repository;

import com.bqjr.mongo.entity.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hp on 2016/12/21.
 */
@Repository
public interface UserRepository extends MongoRepository<UserMongo, Long> {
}
