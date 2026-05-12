package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * [担当: Cさん] 購買・配送フロー (カート・注文入力・メール送信)
 * [担当: Dさん] 生産者応援 (チップ機能) ☆
 */
@Controller
public class CartController {

    /**
     * [要件] カート内容表示
     */
    @GetMapping("/cart")
    public String showCart() {
        return "cart";
    }

    /**
     * [担当: Dさん] [要件: 購入・チップ ☆] 決済確認
     */
    @GetMapping("/checkout/confirm")
    public String showCheckoutConfirm() {
        // [メモ] 合計金額算出、生産者へのチップ選択、配送先確認
        return "checkout_confirm";
    }

    /**
     * [要件] 購入確定処理
     */
    @PostMapping("/checkout/complete")
    public String completePurchase() {
        // [メモ] 購入完了メールの自動送信を実装予定
        return "checkout_complete";
    }
}
