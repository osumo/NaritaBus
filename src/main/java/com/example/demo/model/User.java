package com.example.demo.model;

import lombok.Data;
import java.time.LocalDate;

/**
 * [要件: ユーザー管理・アカウント]
 * - 名前、ID、メールアドレス、生年月日、パスワード
 * - ランクシステム、育成要素、ポイント
 */
@Data
public class User {
    // DBのカラムに対応するフィールドを定義予定
    // [メモ] バリデーション注釈（@NotBlank, @Email等）を後程追加する
    
    private Long id;
    private String userId;
    private String password;
    private String name;
    private String email;
    private LocalDate birthday;
    
    // 特色機能関連
    private String rank;        // 購入実績に応じたランク
    private Integer points;     // 購入等で貯まるポイント
    private Integer nurtureLevel; // 育成要素（超簡易的なステータス） ☆
}
