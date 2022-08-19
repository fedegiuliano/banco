package com.example.demo.dto;

import java.util.List;

import com.example.demo.persistence.entity.TelefonoEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonaDto {

	private String name;
	
	private String email;
	
	private String password;
	
	private List<TelefonoDto> phones;
}
