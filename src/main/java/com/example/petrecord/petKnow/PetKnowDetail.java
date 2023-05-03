package com.example.petrecord.petKnow;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PetKnowDetail {
    @Id
    private int id;
    private String title;
    private String pic;
    private String detail;
}
