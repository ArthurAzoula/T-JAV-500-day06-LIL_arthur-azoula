public class WeaponException extends Exception {

    public WeaponException(String name, String weapon, String RPGClass) {
        if (weapon.isEmpty()) {
            if (RPGClass.equals("Warrior")) {
                super("[" + name + "]: I refuse to fight with my bare hands.");
            } else if (RPGClass.equals("Mage")) {
                super("[" + name + "]: I don't need this stupid " + weapon + "! Don't misjudge my powers!");
            }
        } else {
            if (RPGClass.equals("Warrior")) {
                super("[" + name + "]: A " + weapon + "?? What should I do with this?!");
            } else if (RPGClass.equals("Mage")) {
                super("[" + name + "]: I don't need this stupid " + weapon + "! Don't misjudge my powers!");
            }
        }
    }
}
