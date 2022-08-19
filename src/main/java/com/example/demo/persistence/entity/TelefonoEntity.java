package com.example.demo.persistence.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "telefono")
public class TelefonoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long  number;
	private Long  cityCode;
	private Long  contryCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private PersonaEntity telefonoId;
}
