package com.example.demo.service;

import com.example.demo.model.Product;
import java.util.List;

/**
 * [技術スタック] DI（依存性注入）を活用したビジネスロジック
 */
public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    
    // チップの計算ロジックなどもここで管理予定
    int calculateTotalWithTip(int basePrice, int tipAmount);
}
