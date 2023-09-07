package com.kopo.mainProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "userTable")
@Data
public class UserEntity {
	
	@Id
	@Column(name = "id", length = 15)
    private String id;
	
	@Column(name = "password", length = 100)
    private String password;
	
	@Column(name = "nickname", length = 30)
    private String nickname;
	
	@Column(name = "uuid", length = 100)
    private String uuid;
	
    @Column(name = "userType", length = 5)
    private String userType;
    
}
