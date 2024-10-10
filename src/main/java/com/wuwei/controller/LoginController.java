package com.wuwei.controller;

import com.wuwei.pojo.Result;
import com.wuwei.pojo.User;
import com.wuwei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxy
 * @date 2024/10/8
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/userLogin")
    public Result login(@RequestBody String name ) {
        User user=loginService.login(name);
        return user!=null?Result.success():Result.fail("登录失败");
    }
}
