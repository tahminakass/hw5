public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(40);
        boss.setHealth(100);
        boss.setTypeOfProtection("kinetic");
        System.out.println("\nbossHeath: " + boss.getHealth() + "\n damage: " + boss.getDamage() + " Protection: " + boss.getTypeOfProtection());

        createHeroes();

    }

    public static Heroo[] createHeroes() {
        Heroo Petya = new Heroo(45, 80, " power ");
        Heroo Ivan = new Heroo(55, 70);
        Heroo Larisa = new Heroo(65, " kingPower ", 60);

        Heroo[] heroes = {Petya, Ivan, Larisa};
       for (Heroo heroOne : heroes){
           System.out.println(heroOne);
       }
        return heroes;
    }
}