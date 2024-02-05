package com.zettamine.spring.mi.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "material_dtls")
public class Material {
	@Id
	private String materialId;
	private String materialDescription;
	private String materialType;
	@OneToMany(mappedBy = "material", cascade = CascadeType.ALL)
	private List<MaterialInspectionCharacteristics> inspectionCharacteristics = new ArrayList<>();
	

}
