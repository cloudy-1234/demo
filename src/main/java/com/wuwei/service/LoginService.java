package com.wuwei.service;

import com.wuwei.mapper.UserMapper;
import com.wuwei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class LoginService  {

    @Autowired
    private UserMapper userMapper;
    public User login(String name){
        User user = userMapper.getUserByName(name);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with name: " + name);
        }
        return user;
    }
}
