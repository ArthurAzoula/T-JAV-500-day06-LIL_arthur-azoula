public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equals("magic") || weapon.equals("wand")) {
            super.attack(weapon);
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
        }
    }
}
