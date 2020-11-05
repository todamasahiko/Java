public class Main5 {
	public static void main(String[] args) {
		System.out.println("メソッドの呼び出し");
		hello("田中"); //メソッドの呼び出し
		hello("佐藤"); //引数(1つ)
		hello("鈴木");
		int ans = add(100, 200); //引数(2つ)　戻り値の呼び出し
        System.out.println("100 + 200 = " + ans);
		add(10, 20);
		System.out.println("メソッドの呼び出し終わり");
		methodA();

		System.out.println(add(7, 77));
		System.out.println(add(7.7, 77.7));
		System.out.println(add("yahoo", "google"));

		System.out.println(add("7 * 77 = " + add(1, 2)));
		System.out.println(add("7 * 77 * 2 = " + add(1, 2, 3))); //#が呼び出される

	}
	public static void hello(String name) { //メソッドの定義、文字列型変数nameを定義
		System.out.println(name + "さん、こんにちは");
		System.out.println(name + "さん、こんばんは");
	}
	public static void methodA() {
		System.out.println("A");
		methodB();
	}
	public static void methodB() {
		System.out.println("B");
	}

	public static int add(int x, int y) { //オーバーロード
		return x + y; //戻り値
	}
	public static double add(double x, double y) {
		return x + y;
	}
	public static String add(String x, String y) {
		return x + y;
	}

	public static int add(int a, int b) {
      return a + b;
    }
    public static int add(int a, int b, int c) {
      return a + b + c;
    }
}