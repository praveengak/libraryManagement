package com.example.libraryManagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Value;

import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String userName;
     private String email;
     private String password;

     @ElementCollection(fetch = FetchType.EAGER)
     private Set<String> roles;
}
