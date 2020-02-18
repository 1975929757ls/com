package com.project.service;

import com.project.dao.CommonDao;
import com.project.daomain.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Commonservice {
    @Autowired
    private CommonDao commonDao;
    public List<Common> findall(){
        return commonDao.findall();
    }
    public List<Common> findByid(int id){
        return commonDao.findByid(id);
    }
    public List<String> findcontent(){
        return commonDao.findcontent();
    }
    public void insertcom(Common common){
        commonDao.addcommon(common);
    }
}
