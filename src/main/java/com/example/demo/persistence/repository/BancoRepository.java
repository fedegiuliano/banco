package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistence.entity.PersonaEntity;

public interface BancoRepository extends JpaRepository<PersonaEntity, Long>{

}
