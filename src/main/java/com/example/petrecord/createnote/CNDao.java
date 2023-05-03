package com.example.petrecord.createnote;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CNDao extends JpaRepository<Createnote,Integer> {
}
