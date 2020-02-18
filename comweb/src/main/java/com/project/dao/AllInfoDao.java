package com.project.dao;

import com.project.daomain.AllInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllInfoDao {
    @Select("SELECT information.author,information.id,information.info,information.love,information.zan,common.author,common.author,common.content FROM information,common WHERE information.id=common.id")
    public List<AllInfo> findall();
}
