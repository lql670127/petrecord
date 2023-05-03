package com.example.petrecord.petgrouplist;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PetGroupList {

    @Id
    private int id;
    private String name;
    private String des;
    private String pic;
    private String avatar;
}
