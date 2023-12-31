package org.si.customerservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Customer {

    
	  
		public Customer(Long id, String name, String adresse) {
		    this.id = id;
		    this.name = name;
		    this.adresse = adresse;
		}


		public Customer() {
		  
		}
	
	
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adresse;
}
