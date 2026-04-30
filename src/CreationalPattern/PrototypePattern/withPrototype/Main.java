package CreationalPattern.PrototypePattern.withPrototype;

public class Main {
    public static void main(String[] args) {
        GameCharacter g1 = new GameCharacter("warrior");
        g1.setWeapon("sword");
        g1.show();

        GameCharacter g2 = new GameCharacter("warrior");
        g2.setWeapon("Axe");
        g2.show();

//     problem->
//        Same base object (Warrior)
//👉      But heavy loading happens AGAIN and AGAIN
    }
}
