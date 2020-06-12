package eu.pontsystems.autogyar.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String type;
	private String extra;
	private Integer price;
	@ElementCollection
	private List<String> colors;
	@ElementCollection
	private List<String> extras;
	@OneToOne(mappedBy = "auto")
	private Megrendeles megrendeles;
	
}
