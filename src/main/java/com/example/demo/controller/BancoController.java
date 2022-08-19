package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDto;
import com.example.demo.dto.PersonaResponseDto;
import com.example.demo.persistence.entity.PersonaEntity;
import com.example.demo.service.BancoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/personas")
public class BancoController {
	
	@Autowired
	private BancoService bancoService;

	@PostMapping(value = "/personas",
	produces = {MediaType.APPLICATION_JSON_VALUE})
	    public PersonaEntity createPersona(@RequestBody PersonaEntity entity) {
       return this.bancoService.save(entity);
    }
	
	@GetMapping(value = "/personas/{id}",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	@ApiOperation(value = "Get a BanksEntity by ID", nickname = "get-BanksEntity", httpMethod = "GET",
			notes = "Given an ID a Banks with that ID will be returned", response = PersonaResponseDto.class)
	public ResponseEntity<PersonaResponseDto> findBanksById(
			@ApiParam(value = "ID of the BanksEntity that is returned", required = true)
			@PathVariable(name = "id") Long id) {

		PersonaResponseDto searchedDto = bancoService.findPersonaById(id);

	

		return ResponseEntity.ok().body(searchedDto);
	}
}

