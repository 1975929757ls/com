package com.project.controller;

import com.project.daomain.AllInfo;
import com.project.service.Allinfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/user")
public class AllController {
    @Autowired
    Allinfoservice allinfoservice;
    @RequestMapping("/all")
    public String findallinfo(Model model){
        List<AllInfo> allInfoList=allinfoservice.findall();
        model.addAttribute("allInfoList",allInfoList);
        return "all";
    }

}
