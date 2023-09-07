package com.kopo.mainProject.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kopo.mainProject.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	@Query(value = "select uuid, nickname, userType from userTable where 1=1 and id = :userId and password = :password", nativeQuery = true)
	Map<String, String> login(@Param("userId") String userId, @Param("password") String password);
	
	
//	@Modifying
//	@Query(value = "insert into gallTable(idx, gallName) values(null, :name)", nativeQuery = true)
//	void createGall(@Param("name") String name);
	
}
