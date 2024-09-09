package com.rane.sarvesh.bail.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "section")
public class Section {
	@Id
	private int section_id;
	private String section_name;
	private String punishment;
	@OneToMany
	private List<Law> law_id;
	public int getSection_id() {
		return section_id;
	}
	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getPunishment() {
		return punishment;
	}
	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
	public List<Law> getLaw_id() {
		return law_id;
	}
	public void setLaw_id(List<Law> law_id) {
		this.law_id = law_id;
	}
	@Override
	public String toString() {
		return "Section [section_id=" + section_id + ", section_name=" + section_name + ", punishment=" + punishment
				+ ", law_id=" + law_id + "]";
	}
	
	
}
