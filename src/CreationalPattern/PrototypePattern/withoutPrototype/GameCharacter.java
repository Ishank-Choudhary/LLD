package CreationalPattern.PrototypePattern.withoutPrototype;

public class GameCharacter {
    String type;
    int health;
    String weapon;

    public GameCharacter(String type) {
        this.type = type;
        loadHeavyData();
    }

    public void loadHeavyData(){
        System.out.println("Loading character data from DB for "+type);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setWeapon(String weapon){
        this.weapon=weapon;
    }
    public void show(){
        System.out.println(type+" with weapon "+weapon);
    }
}
