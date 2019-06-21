package com.qing.controller;

import com.qing.entity.User;
import com.qing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhching
 * @Date: 2019/6/21 16:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/restful")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/user",method = RequestMethod.POST)
    public String addUser(User user){
        if (userService.addUser(user)){
            return "新增成功";
        }
        return "新增失败";
    }

    @RequestMapping(value ="/user",method = RequestMethod.GET)
    public String getUserById(@RequestParam(value = "name", required = true)String name){
        if (userService.getUserByName(name) != null && !"".equals(userService.getUserByName(name))){
            return "查询单条成功";
        }
        return "查询单条失败";
    }

    @RequestMapping(value ="/user",method = RequestMethod.DELETE)
    public String deleteUserById(@RequestParam(value = "id", required = true) Integer id){
        if (userService.deleteUserById(id)){
            return "删除成功";
        }
        return "删除失败";
    }


    @RequestMapping(value ="/userAll",method = RequestMethod.GET)
    public String getUser(){
        if (userService.getUser().size() > 0 && userService.getUser() != null ){
            return "查询全部成功";
        }
        return "查询全部失败";
    }

    @RequestMapping(value ="/user",method = RequestMethod.PUT)
    public String updateUser(User user){
        if (userService.updateUser(user)){
            return "更新成功";
        }
        return "更新失败";
    }
}
