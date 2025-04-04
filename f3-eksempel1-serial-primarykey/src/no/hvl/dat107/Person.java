package no.hvl.dat107;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "forelesning3_serial")
public class Person {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String navn;

	public Person() {}
	
	public Person(String navn) {
		this.navn = navn;
	}

	@Override
	public String toString() {
		return String.format("Person: id=%d, navn=%s", id, navn);
	}

	public int getId() {
		return id;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
}
