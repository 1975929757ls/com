package com.project.service;

import com.project.dao.AllInfoDao;
import com.project.daomain.AllInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Allinfoservice {
    @Autowired
    AllInfoDao allInfoDao;
    public List<AllInfo> findall(){
        return allInfoDao.findall();
    }
}
