package com.wuwei.mapper;

import com.wuwei.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE username = #{name}")
    User getUserByName(String name);
}
