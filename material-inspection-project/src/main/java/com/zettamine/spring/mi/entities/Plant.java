package com.zettamine.spring.mi.entities;

import jakarta.persistence.Entity;
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
	private String plantId;
	private String plantName;
	private String plantState;
	private String plantCity;
	private String plantActiveStatus;

}
