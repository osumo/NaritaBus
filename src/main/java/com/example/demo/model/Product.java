package com.example.demo.model;

import lombok.Data;

/**
 * [要件: 商品紹介]
 * - 商品基本情報
 * - 生産過程の記述（必須要件）
 */
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    
    /**
     * [必須] 生産者のこだわりやストーリー
     */
    private String productionProcess; 
    
    private Integer price;
    private Integer stock;
    private String category;
    private String region;
}
