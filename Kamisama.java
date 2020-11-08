public class Kamisama {
    public static void main(String[] args) {
    	Hero h = new Hero();
    	h.name = "ぴょんぴょん丸";
    	h.hp = 100;

    	Matango m1 = new Matango();
    	m1.suffix = 'M';
    	m1.hp = 50;

    	System.out.println("勇者" + h.name + "が誕生しました。");
    	h.sit(3);
    	System.out.println("きのこ星人" + m1.suffix + "が出現しました。");
    	h.slip();
    	h.run();
    }
}