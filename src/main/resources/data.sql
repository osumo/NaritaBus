/* 
    [北海道物産ECサイト プロトタイプ テストデータ定義メモ]
    
    技術スタック: PostgreSQL
    起動時に自動実行され、初期データが投入されます。
    (現在はメモとしてコメントアウトしています)

-- 1. テストユーザーの投入
-- パスワードは仮の文字列です（実際には暗号化が必要）
INSERT INTO users (user_id, password, name, email, birthday, rank, points, nurture_level)
VALUES 
('test_user', 'password123', 'テスト 太郎', 'test@example.com', '1995-01-01', 'BEGINNER', 100, 1)
ON CONFLICT (user_id) DO NOTHING;

-- 2. テスト商品の投入
-- [要件] 生産過程の記述 (production_process) を含むこと
INSERT INTO products (name, description, production_process, price, stock, category, region)
VALUES 
(
    '噴火湾産 活け締め毛がに', 
    '鮮度抜群の毛がにを職人が厳選しました。', 
    '水揚げ後すぐに専用の生け簀で管理。活きが良いものだけを熟練の職人が「活け締め」にして出荷しています。', 
    5800, 20, '海鮮', '道南'
),
(
    '十勝あずきバターサンド', 
    '濃厚なバターとあずきの絶妙なハーモニー。', 
    '十勝産の特別栽培あずきを使用。3日間かけてじっくりと炊き上げた餡を、新鮮な生乳から作ったバターと合わせました。', 
    1200, 50, 'スイーツ', '道東'
)
ON CONFLICT DO NOTHING;
*/

