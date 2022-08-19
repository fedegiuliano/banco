package com.example.demo.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "persona")
public class PersonaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String email;

	private String password;

	private LocalDateTime deletedDate;

	@OneToMany(mappedBy = "telefonoId", cascade = CascadeType.ALL)
	private List<TelefonoEntity> phones;


	private LocalDateTime createDate;

	private LocalDateTime modificateDate;
	
	private LocalDateTime last_login;
	
	private Boolean isactive;

}
