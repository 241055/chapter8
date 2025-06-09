//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        //インスタンスを生成 + 初期値
        Hero h1 = new Hero("ミナト");
        System.out.println(h1.hp);
        System.out.println(h1.name);
        h1.name = "ミナト";
        h1.hp = 100;
        Hero h2 = new Hero();
        System.out.println(h2.name);
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        //ここから動きを書ける
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h = new Hero("ミナト");
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;

        System.out.println("現在の武器は" + h.sword.name);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix ='A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        Matango m3 = new Matango();
        m3.hp = 40;
        m3.suffix = 'c';

        h.slip();
        m1.run();
        m2.run();
        m3.die();
        h.run();

        System.out.println("勇者" + h.name + "を生み出しました!");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}