package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.PersonaResponseDto;
import com.example.demo.mapper.BancoMapperImplement;
import com.example.demo.mapper.IMapper;
import com.example.demo.persistence.entity.PersonaEntity;
import com.example.demo.persistence.repository.BancoRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;
	
	@Autowired
	private BancoMapperImplement bancoMapper;
	
	
	public PersonaEntity save(PersonaEntity entity){
		
		return this.bancoRepository.save(entity);

	}
		public List<PersonaEntity> findAll(){		
		return this.bancoRepository.findAll();
			
	}
		public Optional<PersonaEntity> findById(Long id) {
			
			 return this.bancoRepository.findById(id);
		}
		public PersonaResponseDto findPersonaById(Long id) {
			PersonaResponseDto searchedDto =null;
			
			Optional<PersonaEntity> searchedEntity = bancoRepository.findById(id);
				
				searchedDto = bancoMapper.personaEntityToPersonaDto(searchedEntity.get() );
				
				return searchedDto;
	
			
		}
		
}
