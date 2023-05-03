package com.example.petrecord.feedback;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FBDao extends JpaRepository<FeedBack,Integer> {
}
