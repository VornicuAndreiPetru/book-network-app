package com.vornicu.book.book;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;


@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String authorName;
    private String isbn;
    private String synopsis;
    private String bookCover;
    private boolean archived;
    private boolean shareable;


    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;
    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;
    @CreatedBy
    @Column(nullable = false, updatable = false)
    private Integer createdBy;
    @LastModifiedBy
    @Column(insertable = false)
    private Integer lastModifiedBy;
}
