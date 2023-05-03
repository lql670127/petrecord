package com.example.petrecord.createnote;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Createnote {
    @Id
    private int id;
    private String pet_name;
    private String event_kind;
    private Date notes_date;
    private String notes_time;
    private String memo;
}
