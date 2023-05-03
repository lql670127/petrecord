package com.example.petrecord.petKnow;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/petknowlist")//localhost:8080/petknowlist
public class PKLController {

    @Autowired
    PKLDao pklDao;

    //    查询
    @GetMapping("/getAll")
    public List getAll(){
        List all=pklDao.findAll();
        return all;
    }
}
