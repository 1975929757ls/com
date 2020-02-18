package com.project.service;


import com.project.dao.InformationDao;
import com.project.daomain.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Informationservice {
    @Autowired
    private InformationDao informationDao;

    public List<Information> find(){
        return informationDao.findall();
    }
    public void addinfo(Information info){
        informationDao.addinfo(info);
    }
    public Information findByid(int id){
        return informationDao.finByid(id);
    }
    public void updatezan(Information information){
        informationDao.updatezan(information);
    }
    public void updatelike(Information information){
        informationDao.updatelike(information);
    }
    public List<Information> searckByauthor(String author){
        return informationDao.searchByauthor(author);
    }
    public List<Information> searchByinfo(String info){
        return informationDao.searchinfo(info);
    }
    public List<Information> infoAsc(){
        return informationDao.infoASC();
    }
    public List<Information> infoDesc(){
        return informationDao.infoDESC();
    }
    public List<Information> infotop(){
        return informationDao.infotop();
    }
}
