package com.thymleaf.ThymeleafDemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.*;
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@Table(name = "users")
public class User {
    
    @Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    // standard constructors / setters / getters / toString
}
