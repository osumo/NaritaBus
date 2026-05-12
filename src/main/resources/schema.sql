/* 
    [北海道物産ECサイト プロトタイプ DB構成メモ]
    
    技術スタック: PostgreSQL / MyBatis
    
    1. users (ユーザー管理)
        - id: SERIAL PRIMARY KEY
        - user_id: VARCHAR(50) UNIQUE NOT NULL (ログイン用ID)
        - password: VARCHAR(255) NOT NULL
        - name: VARCHAR(100) NOT NULL
        - email: VARCHAR(255) UNIQUE NOT NULL
        - birthday: DATE
        - rank: VARCHAR(20) DEFAULT 'BEGINNER' (ランクシステム用)
        - points: INTEGER DEFAULT 0 (ポイント用)
        - nurture_level: INTEGER DEFAULT 1 (育成要素 ☆)

    2. products (商品管理)
        - id: SERIAL PRIMARY KEY
        - name: VARCHAR(200) NOT NULL
        - description: TEXT
        - production_process: TEXT (生産過程の記述 必須項目)
        - price: INTEGER NOT NULL
        - stock: INTEGER DEFAULT 0
        - category: VARCHAR(50)
        - region: VARCHAR(50) (地域: 道央, 道南, 道東, 道北)

    3. favorites (お気に入り)
        - user_id: INTEGER REFERENCES users(id)
        - product_id: INTEGER REFERENCES products(id)

    4. orders (注文・配送)
        - id: SERIAL PRIMARY KEY
        - user_id: INTEGER REFERENCES users(id)
        - total_amount: INTEGER
        - tip_amount: INTEGER (生産者へのチップ ☆)
        - shipping_fee: INTEGER
        - address: TEXT
        - payment_method: VARCHAR(50)
        - ordered_at: TIMESTAMP DEFAULT CURRENT_TIMESTAMP
*/
