package com.example.libraryManagement.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class IssueRecord {

    private Long id;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    private Boolean isReturn;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;


}
