package com.project.controller;

import com.project.daomain.AllInfo;
import com.project.daomain.Common;
import com.project.daomain.Information;
import com.project.service.Allinfoservice;
import com.project.service.Commonservice;
import com.project.service.Informationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class CommonController {
    @Autowired
    Commonservice commonservice;
    @Autowired
    Allinfoservice allinfoservice;
    @Autowired
    Informationservice informationservice;
    @RequestMapping("/addcommon")
    public String insertcommon(@RequestParam(name = "id") String id, Model model){
        model.addAttribute("id",id);
        return "addcommon";
    }
    @RequestMapping("/sbcommon")
    public String passcommon(String id,String common,String name,Model model){
        int cid=Integer.parseInt(id);
        System.out.println(cid);
        Common common1=new Common();
        common1.setContent(common);
        common1.setId(cid);
        common1.setName(name);
        commonservice.insertcom(common1);
        List<Common> commonList=commonservice.findByid(cid);
        for (Common com:commonList) {
            System.out.println(com);
        }
        model.addAttribute("commonList",commonList);
        return "common";
    }
    @RequestMapping("/fanhui")
    public String revert(Model model){
        List<Information> informationList=informationservice.find();
        model.addAttribute("informationList",informationList);
        return "info";
    }
}

