package com.zettamine.spring.mi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "plant_dtls")
@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class Plant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer plantId;
	private String plantName;
	private String plantState;
	private String plantCity;
	private String plantActiveStatus;

}
