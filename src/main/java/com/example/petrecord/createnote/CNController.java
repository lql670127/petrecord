package com.example.petrecord.createnote;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/createnote")  //地址：localhost:8080/createnote
public class CNController {
    @Autowired
    CNDao cnDao;

    //    查询
    @GetMapping("/getAll")   // 地址：localhost:8080/createnote/getAll
    public List getAll() {
        List all = cnDao.findAll();
        return all;
    }

    //    添加数据到数据库，更新数据库里的数据
    @GetMapping("/addData")     // 地址：localhost:8080/createnote/addData
    public Createnote addData(
            @RequestParam("pet_name") String pet_name,
            @RequestParam("event_kind") String event_kind,
            @RequestParam("notes_date") Date notes_date,
            @RequestParam("notes_time") String notes_time,
            @RequestParam("memo") String memo
    ) {
        Createnote createnote = new Createnote();
        createnote.setPet_name(pet_name);
        createnote.setEvent_kind(event_kind);
        createnote.setNotes_date(notes_date);
        createnote.setNotes_time(notes_time);
        createnote.setMemo(memo);
        Createnote save = cnDao.save(createnote);
        return save;
    }

    //    删除数据库里的单条数据
    @GetMapping("/deleteData")
    public String deleteData(@RequestParam("id") int id) {
        cnDao.deleteById(id);
        return "删除成功";
    }

}
