package com.project.dao;

import com.project.daomain.Common;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommonDao {
    @Select("select * from common")
    public List<Common> findall();
    @Select("select content from common")
    public List<String> findcontent();
    @Select("select * from common where id=#{id}")
    public List<Common> findByid(@Param("id") int id);
    @Insert("insert into common(id,name,content) value(#{id},#{name},#{content})")
    public void addcommon(Common common);
}
