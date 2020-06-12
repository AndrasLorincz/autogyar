package eu.pontsystems.autogyar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Megrendeles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nev;
	private String status;
	private Double osszeg;
	@OneToOne(cascade = CascadeType.ALL)
	private Auto auto;
	
	@OneToMany(mappedBy = "megrendeles", cascade = {CascadeType.ALL})
	private List<Megjegyzes> megjegyzesek=new ArrayList<Megjegyzes>();
}
