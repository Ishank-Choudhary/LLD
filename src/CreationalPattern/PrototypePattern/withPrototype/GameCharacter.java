package CreationalPattern.PrototypePattern.withPrototype;

public class GameCharacter implements Cloneable{
    String type;
    int health;
    String weapon;

    public GameCharacter(String type) {
        this.type = type;
        loadHeavyData(); // expensive (only once)
    }

    private void loadHeavyData() {
        System.out.println("Loading character data from DB for " + type);
        try {
            Thread.sleep(2000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void show() {
        System.out.println(type + " with weapon " + weapon);
    }

    //prototype method
    @Override
    public GameCharacter clone(){
        try{
            return (GameCharacter) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
