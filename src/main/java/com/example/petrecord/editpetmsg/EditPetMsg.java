package com.example.petrecord.editpetmsg;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class EditPetMsg {
    @Id
    private String id;
    private String pet_kind;
    private String pet_sex;
    private String pet_status;
    private int pet_weight;
    private Date home_time;
    private String pet_avatar;
}
