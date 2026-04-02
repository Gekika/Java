package com.gekika.backend.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")


public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name = "category_name")
    private String categoryName;
    private String description;
    private String imageUrl;

    public Category() { }

    public Category(String categoryName, String description, String imageUrl) {
        this.categoryName = categoryName;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
