package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.persistence.entity.TelefonoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PersonaResponseDto {

	private Long id;
	
	private LocalDateTime createDate;

	private LocalDateTime modificateDate;
	
	private LocalDateTime last_login;
	
	private Boolean isactive;


}
