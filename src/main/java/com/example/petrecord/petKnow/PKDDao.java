package com.example.petrecord.petKnow;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PKDDao extends JpaRepository<PetKnowDetail,Integer> {
}
