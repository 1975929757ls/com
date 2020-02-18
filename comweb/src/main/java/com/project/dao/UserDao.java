package com.project.dao;

import com.project.daomain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user where name=#{name} and password=#{password}")
    public User findBynamepassword(@Param("name") String name, @Param("password") String password);
    @Select("select * from user")
    public List<User> findall();
    @Insert("insert into user(name,password,username,phone,QQ) value(#{name},#{password},#{username},#{phone},#{QQ})")
    public void adduser(User user);

}
