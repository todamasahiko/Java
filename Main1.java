public class Main1 {
    public static void main(String[] args) {
    	String msg = "好きな記号は¥'です";
    	System.out.println("好きな記号はシングルクォーテーション(¥')です");

    	int x = 7;
    	x--; //デクリメント
    	System.out.println(x);

    	float y = 7; //代入時の自動型変換
    	double z = y; //代入時の自動型変換
    	//int w = 0.7; //型より小さい型はエラーになる
    	byte q = 2; //byte。short型にint型の代入は例外
    	System.out.println(y);
		System.out.println(z);
		System.out.println(q);

		int e = (int)7.7; //キャスト演算子
		System.out.println(e);

    	long b = 7 + 7L; //intをlongに変換
    	double c = 7.7 * 2; //intをdoubleに変換
    	String msg1 = 7 + "が好きです"; //intをStringに変換
    	System.out.println(msg1);
    	System.out.println(b);
    	System.out.println(c);

    	int p = 1, o = 2;
    	int m = Math.max(p, o); //値を比較して大きいものを代入する
    	System.out.println(m);

    	System.out.println(); //画面に表示する
    	System.out.print(b); //画面に表示する（改行なし）
    	System.out.print(c);

        String age = "12";
    	int n = Integer.parseInt(age); //文字列を数値に変換する
    	System.out.println("年齢は" + n + "です");

    	int r = new java.util.Random().nextInt(7); //乱数を発生させる
    	System.out.println("年齢は" + r + "ですか？");

    	System.out.println("名前を入力してください");
    	String name = new java.util.Scanner(System.in).nextLine(); //キーボードから1行の文字列入力を受け取る
    	System.out.println("年齢は？");
    	int age1 = new java.util.Scanner(System.in).nextInt(); //キーボードから1つの整数入力を受け取る
    	System.out.println("いらっしゃい！" + age1 + "歳の" + name + "さん");
    }
}