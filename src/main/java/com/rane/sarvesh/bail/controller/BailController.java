package com.rane.sarvesh.bail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rane.sarvesh.bail.entity.Law;
import com.rane.sarvesh.bail.entity.Section;
import com.rane.sarvesh.bail.repository.LawRepository;
import com.rane.sarvesh.bail.repository.SectionRepository;

@RestController
public class BailController {
	
	@Autowired
	LawRepository lawRepo;
	
	@Autowired
	SectionRepository sectionRepo;
	
	@GetMapping(path="/laws")
	public List<Law> getLaws()
	{
		return lawRepo.findAll();
	}
	
	@GetMapping(path="/sections/{id}")
	public List<Section> getSection(@PathVariable String id)
	{
		return sectionRepo.getSections(Integer.valueOf(id));
	}

}
