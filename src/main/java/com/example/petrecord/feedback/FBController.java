package com.example.petrecord.feedback;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//localhost:8080/feedback
@RequestMapping("/feedback")
public class FBController {

    @Autowired
    FBDao fbDao;

    //    查询
    @GetMapping("/getAll")
    public List getAll(){
        List all=fbDao.findAll();
        return all;
    }

    //    添加数据到数据库，更新数据库里的数据
    @GetMapping("/addData")
    public FeedBack addData(
            @RequestParam("id") String id,
            @RequestParam("feed_back_msg") String feed_back_msg
    ){
        FeedBack feedBack=new FeedBack();
        feedBack.setId(id);
        feedBack.setFeed_back_msg(feed_back_msg);
        FeedBack save=fbDao.save(feedBack);
        return save;
    }
}
