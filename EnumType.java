// Enum type untuk Character Class
enum CharacterClass {
    FIGHTER, MAGE, Marksman
}

public class EnumType {
    public static void main(String[] args) {
        // Wrapper Class 
        int playerHealth = Integer.valueOf(100); // Boxing
        System.out.println("Initial Player Health: " + playerHealth);

        // Autoboxing dan Unboxing : Contoh kasus Hero Damage
        int damage = 20;
        playerHealth -= damage; // Unboxing
        System.out.println("Player took damage: " + damage); // Autoboxing
        System.out.println("Remaining Player Health: " + playerHealth); //Unboxing

        // Autoboxing dan Unboxing : Contoh kasus Hero Healing
        int potionHeal = 30; // Autoboxing
        playerHealth += potionHeal; // Unboxing
        System.out.println("Player used a healing potion: +" + potionHeal + " HP");
        System.out.println("Player Health after healing: " + playerHealth);

        // Enum
        CharacterClass chosenClass = CharacterClass.FIGHTER;
        System.out.println("Player chose the class: " + chosenClass);

        // Looping semua karakter pada class
        System.out.println("Available Character Classes:");
        for (CharacterClass characterClass : CharacterClass.values()) {
            System.out.println("- " + characterClass);
        }
    }
}
