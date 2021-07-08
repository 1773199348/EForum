package com.jingling.eforum.service.impl;

import com.jingling.eforum.mapper.TributeMapper;
import com.jingling.eforum.service.TributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TributeServiceImpl implements TributeService {
    @Autowired
    TributeMapper tributeMapper;
    public int ins(String type, String name, String people, String phone, String email, String foru, String product){
        return  tributeMapper.ins( type, name, people, phone, email, foru, product);
    }
}
