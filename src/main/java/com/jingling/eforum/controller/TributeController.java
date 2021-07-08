package com.jingling.eforum.controller;

import com.jingling.eforum.service.TributeService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TributeController {
    @Autowired
    TributeService tributeService;

    public String ins(String type, String name, String people, String phone, String email, String foru, String product){
        tributeService.ins( type, name, people, phone, email, foru, product);


        return "success";
    }

}
