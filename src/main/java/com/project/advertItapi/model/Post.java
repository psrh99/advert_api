package com.project.advertItapi.model;

import lombok.AllArgsConstructor;

// import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    
    private long id;
    private String title;
    private int price;
    private String description;
    private String imageUrl;
    private String category;
}
