public class Heroo {
    private int health;
    private int damage;
    private String superpower;

    // Constructor
    public Heroo(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;

    }

    public Heroo(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }
    public Heroo(int health, String superpower, int damage) {
        this.health = health;
        this.superpower = superpower;
        this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
    public String toString() {
        return "Health: " + health + "\nDamage: " + damage + "\nAbilyty: " + superpower;
    }
}
