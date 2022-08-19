package com.example.demo.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.PersonaResponseDto;
import com.example.demo.persistence.entity.PersonaEntity;

@Component
public class BancoMapperImplement implements IMapper<PersonaDto, PersonaEntity>{


	
	public PersonaResponseDto personaEntityToPersonaDto(PersonaEntity entity){
		  
		return PersonaResponseDto.builder()
				.id(entity.getId())
				.createDate(entity.getCreateDate())
				.modificateDate(entity.getModificateDate())
				.last_login(entity.getLast_login())
				.modificateDate(entity.getModificateDate())
				.isactive(entity.getIsactive())
				.build();
	  
	}

	

	
	
}
