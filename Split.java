//計算機プログラム
package splitapp.main; //パッケージ
import splitapp.logics.SplitLogic; //import文
public class Split {
	public static void main(String[] args) {
		int a = 7; int b = 1;
		int total = SplitLogic.tasu(a, b);
		int delta = splitapp.logics.SplitLogic.hiku(a, b);
		System.out.println("足したら" + total + "、引いたら" + delta);
	}
}