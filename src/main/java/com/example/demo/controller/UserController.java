package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * [担当: Aさん] ユーザー認証・登録基盤 (登録・ログイン)
 * [担当: Dさん] マイページ・エンゲージメント (ランク・育成要素・ポイント) ☆
 */
@Controller
public class UserController {

    /**
     * [要件] ユーザー登録画面の表示
     */
    @GetMapping("/register")
    public String showRegistrationForm() {
        // [メモ] model.addAttribute("userForm", new UserForm()); 等を実装予定
        return "register";
    }

    /**
     * [要件] ユーザー登録処理
     */
    @PostMapping("/register")
    public String registerUser() {
        // [メモ] バリデーション、パスワード暗号化、DB保存を実装予定
        return "redirect:/login";
    }

    /**
     * [要件] ログイン画面の表示
     */
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    /**
     * [担当: Dさん] [要件] マイアカウント（ランク・育成・ポイント表示）
     */
    @GetMapping("/account")
    public String showAccount() {
        // [メモ] セッションからユーザー情報を取得して表示
        return "account";
    }
}
