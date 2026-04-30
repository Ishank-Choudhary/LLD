package CreationalPattern.PrototypePattern.withoutPrototype;

public class Main {
    public static void main(String[] args) {
        GameCharacter original = new GameCharacter("warrior");

        GameCharacter c1 = original.clone();
        c1.setWeapon("sword");
        c1.show();

        GameCharacter c2 = original.clone();
        c2.setWeapon("Gun");
        c2.show();
    }
}
