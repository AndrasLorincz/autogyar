package eu.pontsystems.autogyar.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Megjegyzes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String text;
	private Date date;
	private Date crd;
	private String cru;
	private Date lmd;
	private String lmu; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Megrendeles megrendeles;
}
