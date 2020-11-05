public class Main6 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5};
		printArray(array); //配列を渡す

		int[] array1 = makeArray(3);
        for (int i : array1) {   //arrayの全要素出力
          System.out.println(i);
        }
	}
	public static void printArray(int[] array) { //引数に配列指定
		for (int element : array) {
			System.out.println(element);
		}
	}
    public static int[] makeArray(int size) { //int型配列の作成
      int[] newArray = new int[size];
      for (int i = 0; i < newArray.length; i++) {
        newArray[i] = i;
      }
      return newArray; //配列を戻す
    }
}