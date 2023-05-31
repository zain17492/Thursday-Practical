package com.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name="Product_table")
public class Product 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="product_id")
	private int pid;
	
	@Column(name="product_name")
	private String pname;
	
	@OneToOne(mappedBy="product")
	@JsonBackReference
	private Customer customer;
	

}
