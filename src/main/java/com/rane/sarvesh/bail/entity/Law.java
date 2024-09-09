package com.rane.sarvesh.bail.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "law")
public class Law {

	@Id
	private int law_id;
	private String law_name;
	public int getLaw_id() {
		return law_id;
	}
	public void setLaw_id(int law_id) {
		this.law_id = law_id;
	}
	public String getLaw_name() {
		return law_name;
	}
	public void setLaw_name(String law_name) {
		this.law_name = law_name;
	}
	@Override
	public String toString() {
		return "Law [law_id=" + law_id + ", law_name=" + law_name + "]";
	}
	
	
}
