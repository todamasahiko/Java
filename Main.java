public class Main { //クラスブロック
    public static void main(String[] args) { //メソッドブロック
        System.out.println("おはよう");
        System.out.println("こんにちは");
        System.out.println("こんばんは");
        System.out.println("こんばんは");
        System.out.println(7 + 7);
        System.out.println(7 * 7);
        int a; //変数の宣言
        a = 17; //変数の代入
        System.out.println(a + a - 2); //変数の取得
        String likes = "ねこ"; //変数の初期化
        likes = "いぬ"; //再代入
        System.out.println(likes + "が好きです");

        final double PI = 3.14; //定数の宣言
        int pie = 7;
        //PI = 10; //コンパイルエラーの確認
        System.out.println("半径" + pie + "cmの円の面積は");
        System.out.println(pie * pie * PI);

        int aa = 3; int b = 5; //変数の宣言
        int c = aa * b; //変数の計算式
        System.out.println("縦幅" + aa + "横幅" + b + "の長方形の面積は" + c); //命令実行

        boolean invalid = true;
        char likekanji = '駆';
        double pi = 3.14;
        long number = 312159265853979L;
        String phrase = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";
    }
}