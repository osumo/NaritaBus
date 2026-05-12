package com.example.demo.mapper;

import com.example.demo.model.Product;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * [技術スタック] MyBatisによるDBアクセス
 */
@Mapper
public interface ProductMapper {
    // [メモ] SQLは別ファイルのXMLまたは注釈で記述予定
    
    List<Product> findAll();
    Product findById(Long id);
    
    // 診断型検索用の条件付き検索など
    List<Product> findByDiagnosisResults(String category, String region);
}
