public class Matango {
    int hp;
    final int level = 10;
    char suffix;
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
    }
    public void die() {
        System.out.println("お化けキノコ" + this.suffix + "は驚いて死んだ!");
    }
}
