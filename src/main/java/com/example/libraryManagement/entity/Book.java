package com.example.libraryManagement.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Book {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Integer quantity;
    private Boolean isAvailable;

}
