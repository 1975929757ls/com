package com.project.dao;

import com.project.daomain.Information;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationDao {
    @Select("select * from information")
    public List<Information> findall();
    @Select("select * from information where id=#{id}")
    public Information finByid(@Param("id") int id);
    @Insert("insert into information(info,author,zan,love) value(#{info},#{author},1,1)")
    public void addinfo(Information info);
    @Update("update information set zan=#{zan} where id=#{id}")
    public void updatezan(Information information);
    @Update("update information set love=#{love} where id=#{id}")
    public void updatelike(Information information);
    @Select("select * from information where author=#{author}")
    public List<Information> searchByauthor(@Param("author") String author);
    @Select("select * from information where info like '%${info}%'")
    public List<Information> searchinfo(@Param("info") String info);
    //升序
    @Select("select * from information order by zan")
    public List<Information> infoASC();
    //降序
    @Select("select * from information order by zan desc")
    public List<Information> infoDESC();
    @Select("select * from information order by zan desc limit 3")
    public List<Information> infotop();

}
