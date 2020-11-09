public class Kamisama {
    public static void main(String[] args) {
    	Sword s = new Sword();
    	s.name = "ちゅんちゅんせいばー";
    	s.damage = 10;

    	Hero h1 = new Hero("ぴょんぴょん丸");
    	h1.sword = s;

    	Hero h2 = new Hero();
    	h2.hp = 200;

    	Wizard w = new Wizard();
    	w.name = "てんてん";
    	w.hp = 50;

    	Matango m1 = new Matango();
    	m1.suffix = 'M';
    	m1.hp = 50;

    	System.out.println("勇者" + h1.name + "が誕生しました。");
    	System.out.println("HPは" + h1.hp + "です。");
    	System.out.println("勇者" + h2.name + "が誕生しました。");
    	System.out.println("HPは" + h2.hp + "です。");
    	System.out.println("装備している武器は" + h1.sword.name + "です。");
    	h1.sit(3);
    	h1.slip();
    	w.heal(h1);
    	System.out.println("きのこ星人" + m1.suffix + "が出現しました。");
    	h1.attack();
    	h1.run();
    }
}