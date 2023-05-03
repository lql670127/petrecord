package com.example.petrecord.petgrouplist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/petgrouplist")//localhost:8080/petgrouplist
public class PGLController {

    @Autowired
    PGLDao pglDao;

    //    查询
    @GetMapping("/getAll")
    public List getAll() {
        List all = pglDao.findAll();
        return all;
    }
}
