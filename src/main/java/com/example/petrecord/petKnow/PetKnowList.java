package com.example.petrecord.petKnow;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PetKnowList {

    @Id
    private int id;
    private String des;
    private String pic;
}
