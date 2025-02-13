package com.cg.project.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int carCode;
	private String carName;
	@ManyToOne
	private Customer customer;
	public Car() {
		super();
	}
}