package com.example.petrecord.editpetmsg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/edit")
public class EPMController {

    @Autowired
    EPMDao epmDao;

    //    查询
    @GetMapping("/getAll")
    public List getAll() {
        List all = epmDao.findAll();
        return all;
    }

    //    添加数据到数据库，更新数据库里的数据
    @GetMapping("/addData")
    public EditPetMsg addData(
            @RequestParam("id") String id,
            @RequestParam("pet_kind") String pet_kind,
            @RequestParam("pet_sex") String pet_sex,
            @RequestParam("pet_status") String pet_status,
            @RequestParam("pet_weight") int pet_weight,
            @RequestParam("home_time") Date home_time
    ) {
        EditPetMsg editPetMsg = new EditPetMsg();
        editPetMsg.setId(id);
        editPetMsg.setPet_kind(pet_kind);
        editPetMsg.setPet_sex(pet_sex);
        editPetMsg.setPet_status(pet_status);
        editPetMsg.setPet_weight(pet_weight);
        editPetMsg.setHome_time(home_time);
        EditPetMsg save = epmDao.save(editPetMsg);
        return save;
    }
}
