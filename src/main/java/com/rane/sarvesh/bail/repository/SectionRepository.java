package com.rane.sarvesh.bail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rane.sarvesh.bail.entity.Section;

public interface SectionRepository extends JpaRepository<Section, Integer>{

	@Query(nativeQuery = true, value = "select * from section where law_id = :id")
	List<Section> getSections(int id);

}
