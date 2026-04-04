package com.gekika.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @NonNull Integer id;
    private @NonNull String name;
    private @NonNull String ImageUrl;
    private @NonNull double price;
    private @NonNull String description;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(){
        }

    public Product(@NonNull String name,@NonNull String ImageUrl,@NonNull double price,@NonNull String description ){
        this.name = name;
        this.ImageUrl = ImageUrl;
        this.price = price;
        this.description = description;
    }
}
