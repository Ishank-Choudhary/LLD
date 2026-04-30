package CreationalPattern.BuilderPattern.withoutBuilder;

public class House {
    private String structure;
    private String name;
    private boolean isSafe;
    private boolean hasSwimmingpool;
    private boolean hasParking;

    public House(String structure, String name, boolean isSafe, boolean hasSwimmingpool, boolean hasParking) {
        this.structure = structure;
        this.name = name;
        this.isSafe = isSafe;
        this.hasSwimmingpool = hasSwimmingpool;
        this.hasParking = hasParking;
    }

    @Override
    public String toString() {
        return "House{" +
                "structure='" + structure + '\'' +
                ", name='" + name + '\'' +
                ", isSafe=" + isSafe +
                ", hasSwimmingpool=" + hasSwimmingpool +
                ", hasParking=" + hasParking +
                '}';
    }
}
