package com.shixi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: UserController
 * @Description:
 * @author: jiangyujian
 * @date :2019/6/6
 */
@Controller("user")
@RequestMapping("/user")
public class UserController {
    public void getUser(@RequestParam(name = "id") Integer id){

    }
}
