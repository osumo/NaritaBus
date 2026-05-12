package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * [担当: Bさん] 商品・検索エンジン
 * - 商品一覧・詳細・お気に入り機能
 */
@Controller
public class ProductController {

    /**
     * [要件] ルートページ（インデックス）の表示
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * [要件] 商品一覧・検索
     */
    @GetMapping("/products")
    public String listProducts() {
        // [メモ] フィルタリング（カテゴリ・地域・値段）を実装予定
        return "product_list";
    }

    /**
     * [担当: Dさん] [要件: 質問形式絞り込み ☆] 診断型検索
     */
    @GetMapping("/diagnosis")
    public String showDiagnosis() {
        return "diagnosis";
    }

    /**
     * [要件] 商品詳細
     * - 生産過程の記述（必須）
     */
    @GetMapping("/product/detail")
    public String showProductDetail(@RequestParam Long id) {
        // [メモ] MyBatisで商品情報を取得してモデルにセット
        return "product_detail";
    }
}
