package com.example.petrecord.petKnow;

import com.example.petrecord.petKnow.PetKnowList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PKLDao extends JpaRepository<PetKnowList,Integer> {
}
