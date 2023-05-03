package com.example.petrecord.petKnow;


import com.example.petrecord.createnote.Createnote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/petknowdetail")//localhost:8080/petknowdetail
public class PKDController {

    @Autowired
    PKDDao pkdDao;

    //    查询
    @GetMapping("/getAll")
    public List getAll() {
        List all = pkdDao.findAll();
        return all;
    }

    //    添加
    @GetMapping("/addData")     // 地址：localhost:8080/petknowdetail/addData
    public PetKnowDetail addData(
//            @RequestParam("id") String id,
            @RequestParam("title") String title,
            @RequestParam("pic") String pic,
            @RequestParam("detail") String detail
    ) {
        PetKnowDetail petknowdetail = new PetKnowDetail();
//        petknowdetail.setId(id);
        petknowdetail.setTitle(title);
        petknowdetail.setPic(pic);
        petknowdetail.setDetail(detail);
        PetKnowDetail save = pkdDao.save(petknowdetail);
        return save;
    }

    //    删除
    @GetMapping("/deleteData")
    public String deleteData(@RequestParam("id") int id) {
        pkdDao.deleteById(id);
        return "删除成功";
    }
}
