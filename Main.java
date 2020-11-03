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
        PI = 10;
        System.out.println("半径" + pie + "cmの円の面積は");
        System.out.println(pie * pie * PI);
    }
}