package com.project.controller;

import com.project.daomain.Common;
import com.project.daomain.Information;
import com.project.service.Commonservice;
import com.project.service.Informationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class InfoController {
    @Autowired
    Informationservice informationservice;
    @Autowired
    Commonservice commonservice;
    @RequestMapping("/fabu")
    public String pass(){
        return "addinfo";
    }
    @RequestMapping("/add")
    public String  addinfo(String info,String author,Model model){
        if(info==""||author==""){
            return "false";
        }else{
            Information information=new Information();
            information.setAuthor(author);
            information.setInfo(info);
            information.setZan(1);
            information.setLike(1);
            System.out.println(information);
            informationservice.addinfo(information);
            List<Information> informationList=informationservice.find();
            model.addAttribute("informationList",informationList);
            return "info";
        }
    }
    @RequestMapping("/click")
    public String zan(@RequestParam(name = "id") String id,Model model){
        System.out.println(id);
        int infoid=Integer.parseInt(id);
        Information information=informationservice.findByid(infoid);
        System.out.println(information);
        information.setZan(information.getZan()+1);
        System.out.println(information.getZan());
        informationservice.updatezan(information);
        List<Information> informationList=informationservice.find();
        model.addAttribute("informationList",informationList);
        return "info";
    }
    @RequestMapping("/likes")
    public String like(@RequestParam(name = "id") String id,Model model){
        int infoid=Integer.parseInt(id);
        Information information=informationservice.findByid(infoid);
        information.setLike(information.getLove()+1);
        System.out.println(information.getLove());
        informationservice.updatelike(information);
        List<Information> informationList=informationservice.find();
        model.addAttribute("informationList",informationList);
        return "info";
    }
    @RequestMapping("/authorsearch")
    public String searchauthor(String author,Model model){
        if(author==""){
            return "false";
        }else {
            List<Information> informationList = informationservice.searckByauthor(author);
            if(informationList==null){
                return "false";
            }else {
                System.out.println(informationList);
                model.addAttribute("informationList",informationList);
                System.out.println("执行model");
                return "searchResult";
            }
        }
    }
    @RequestMapping("/searchByinfo")
    public String searchByinfo(String info,Model model){
        List<Information> informationList=informationservice.searchByinfo(info);
        System.out.println(informationList);
        model.addAttribute("informationList",informationList);
        return "searchResult";
    }
    @RequestMapping("/see")
    public String seecommon(@RequestParam(name = "id") String id,Model model){
        int cid=Integer.parseInt(id);
        List<Common> commonList=commonservice.findByid(cid);
        model.addAttribute("commonList",commonList);
        return "common";
    }

}
