package com.gekika.backend.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categories")


public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Column(name = "category_name")
    private String categoryName;
    @Getter
    @Setter
    private String description;
    @Setter
    @Getter
    private String imageUrl;

    public Category() {
    }

    public Category(String categoryName, String description, String imageUrl) {
        this.categoryName = categoryName;
        this.description = description;
        this.imageUrl = imageUrl;
    }


    public void setCategoryName(String categoryName) {
    }

}
