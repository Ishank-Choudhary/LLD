package CreationalPattern.BuilderPattern.withBuilder;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setName("Ishank")
                .setSafe(true)
                .setStructure("Concrete")
                .build();

        System.out.println(house.getName());
    }

}
