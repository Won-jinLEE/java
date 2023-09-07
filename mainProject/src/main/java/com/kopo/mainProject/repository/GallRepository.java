package com.kopo.mainProject.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kopo.mainProject.entity.GallEntity;

@Repository
public interface GallRepository extends JpaRepository<GallEntity, String>{
	
	@Query(value = "select * from gallTable where gallName= :name", nativeQuery = true)
	String duplicateCheck(@Param("name") String name);
	
	@Modifying
	@Query(value = "insert into gallTable(idx, gallName) values(null, :name)", nativeQuery = true)
	void createGall(@Param("name") String name);
	
	@Query(value = "select * from gallTable", nativeQuery = true)
	List<Map<String, String>> gallList();
}
