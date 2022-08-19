package com.example.demo.mapper;

import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.PersonaResponseDto;
import com.example.demo.persistence.entity.PersonaEntity;

public interface IMapper<I,o> {

	
	
	 PersonaResponseDto personaEntityToPersonaDto(PersonaEntity entity);
	 

}
