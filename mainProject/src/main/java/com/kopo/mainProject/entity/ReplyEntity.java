package com.kopo.mainProject.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "replyTable")
@Data
public class ReplyEntity {
	
	@Id
    @Column(name = "gallIdx")
    private int gallIdx;
    
    @Column(name = "postSeq")
    private int postSeq;
    
    @Column(name = "replySeq")
    private int replySeq;
    
    @Column(name = "contents", length = 1000)
    private String contents;
    
    @Column(name = "password", length = 65)
    private String password;
    
    @Column(name = "writer", length = 50)
    private String writer;
    
    @Column(name = "writerType", length = 1)
    private String writerType;
    
    @Column(name = "indate")
    private Date indate;
    
}
