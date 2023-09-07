package com.kopo.mainProject.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "boardTable")
@Data
public class BoardEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private int idx;
    
    @Column(name = "seq")
    private int seq;
    
    @Column(name = "gallIdx")
    private int gallIdx;
    
    @Column(name = "title", length = 100)
    private String title;
    
    @Column(name = "password", length = 65)
    private String password;
    
    @Column(name = "contents", length = 4000)
    private String contents;
    
    @Column(name = "count")
    private String count;
    
    @Column(name = "writer", length = 50)
    private String writer;
    
    @Column(name = "writerType", length = 1)
    private String writerType;
    
    @Column(name = "indate")
    private Date indate;
    
}
