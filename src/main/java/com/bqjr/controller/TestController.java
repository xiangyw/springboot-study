package com.bqjr.controller;

import com.bqjr.jpa.entity.UserDb;
import com.bqjr.jpa.services.UserDbService;
import com.bqjr.model.Response;
import com.bqjr.mongo.entity.UserMongo;
import com.bqjr.mongo.services.UserService;
import com.bqjr.redis.entity.UserRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hp on 2016/12/21.
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController{
    @Autowired
    private UserService userService;
    @Autowired
    private UserDbService userDbService;
    @Autowired
    private RedisTemplate redisTemplate;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/hello")
    public String index() {
        log.debug("hello debugger");
        log.info("hello info");
        log.error("hello error");
        return "index";
    }
    @RequestMapping(value = "/mongo/add/user")
    @ResponseBody
    public Object addOne() {
        UserMongo u=new UserMongo();
        u.setId(System.currentTimeMillis());
        u.setAge(18);
        u.setUsername("xiangyw");
        userService.insert(u);
        return Response.success(u);
    }
    @RequestMapping(value = "/mongo/findAll/user")
    @ResponseBody
    public Object findAll() {
        List<UserMongo> userMongo =userService.findAll();
        return Response.success(userMongo);
    }
    @RequestMapping(value = "redis/add/user")
    @ResponseBody
    public Object addOneRedis() {
        UserRedis u=new UserRedis();
        u.setId(System.currentTimeMillis());
        u.setAge(18);
        u.setUsername("xiangyw");
        redisTemplate.opsForValue().set(u.getUsername(),u);
        return Response.success(u);
    }
    @RequestMapping(value = "/redis/findAll/user/{username}")
    @ResponseBody
    public Object findAllRedis(@PathVariable String username) {
        UserRedis u= (UserRedis) redisTemplate.opsForValue().get(username);
        return Response.success(u);
    }
    @RequestMapping(value = "/jpa/add/user")
    @ResponseBody
    public Object addOneDb() {
        UserDb u=new UserDb();
        u.setUsername("xiangyw"+System.currentTimeMillis());
        u.setPhone("15802846520");
        userDbService.insert(u);
        return Response.success(u);
    }
    @RequestMapping(value = "/jpa/findAll/user")
    @ResponseBody
    public Object findAllDb() {
        List<UserDb> userDb =userDbService.findAll();
        return Response.success(userDb);
    }

}
