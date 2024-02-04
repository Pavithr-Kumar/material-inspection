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
@Table(name = "vendor_dtls")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vendorId;
	private String vendorName;
	private String vendorEmail;
	private String vendorState;
	private String vendorCity;
	private String vendorActiveStatus;

}
