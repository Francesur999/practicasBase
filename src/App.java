public class App {
    public static void main(String[] args) {
        SuperHero danielHero = new SuperHero();
        SuperVillain putin = new SuperVillain();
        System.out.println(danielHero.toString());
        System.out.println(putin.toString());

        danielHero.entrenamiento(0, null);
        danielHero.combate(putin);
    }
}
