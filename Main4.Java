public class Main4 {
	public static void main(String[] args) {
		int[] scores = {10, 20, 30, 40, 50};
		int sum = 0; //変数の初期化
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; //1科目ずつsumに合算する
			if (scores[i] >= 25) {
				count++;
			}
		}
		System.out.println(scores[i]); //ループ毎にiが変化する

		int[] seq = new int [10];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new jaba.util.Random().nextInt(4);
		}
		for (int i = 0; i < seq.length; i++) {
        	char[] base = {'A', 'T', 'G', 'C'};
		}
		System.out.println(base[seq[i]] + " ");
	}
}