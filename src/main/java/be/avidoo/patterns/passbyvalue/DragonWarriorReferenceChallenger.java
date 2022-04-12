package be.avidoo.patterns.passbyvalue;

public class DragonWarriorReferenceChallenger {

    public static void main(String... doYourBest) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;

        /**
         * Finally, we pass null to the variables here, but not to the objects.
         * The objects will remain the same as long as they are still accessible externally--in this case through the main method.
         * And, although the local variables will be null, nothing will happen to the objects:
         */
        weapon = null;
        warriorProfession = null;
    }

}
