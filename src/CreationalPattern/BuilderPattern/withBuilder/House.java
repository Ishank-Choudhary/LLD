package CreationalPattern.BuilderPattern.withBuilder;

// House is final object
public class House {
    private String structure;
    private String name;
    private boolean isSafe;
    private boolean hasSwimmingpool;
    private boolean hasParking;

    public String getName() {
        return name;
    }

    //keep outer class constructor private
    private House(Builder builder) {
        this.structure = builder.structure;
        this.name = builder.name;
        this.isSafe = builder.isSafe;
        this.hasSwimmingpool = builder.hasSwimmingpool;
        this.hasParking = builder.hasParking;
    }

    //static inner class - temporary storage(like a form)
    public static class Builder{
        private String structure;
        private String name;
        private boolean isSafe;
        private boolean hasSwimmingpool;
        private boolean hasParking;

        public Builder setStructure(String structure) {
            this.structure=structure;
            return this;
        }

        public Builder setName(String name) {
            this.name=name;
            return this;
        }

        public Builder setSafe(boolean safe) {
            this.isSafe = safe;
            return this;
        }

        public Builder setHasSwimmingpool(boolean hasSwimmingpool) {
            this.hasSwimmingpool=hasSwimmingpool;
            return this;
        }

        public Builder setHasParking(boolean hasParking) {
            this.hasParking=hasParking;
            return this;
        }

        // convert form to real object
        public House build(){
            return new House(this);
        }
    }
}
