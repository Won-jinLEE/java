package com.kopo.mainProject.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kopo.mainProject.entity.UserEntity;

@Repository
public interface BoardRepository extends JpaRepository<UserEntity, String>{
	
	@Query(value = "select seq, title, writer, indate, count from boardTable where 1=1 and gallIdx = :idx", nativeQuery = true)
	List<Map<String, String>> postList(@Param("idx") String idx);
	
	
//	@Modifying
//	@Query(value = "insert into gallTable(idx, gallName) values(null, :name)", nativeQuery = true)
//	void createGall(@Param("name") String name);
	
}
