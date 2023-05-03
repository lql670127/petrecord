package com.example.petrecord.feedback;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class FeedBack {
    @Id
    private String id;
    private String feed_back_msg;
}
