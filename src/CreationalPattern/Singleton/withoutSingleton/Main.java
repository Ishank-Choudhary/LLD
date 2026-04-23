package CreationalPattern.Singleton.withoutSingleton;

public class Main {
    public static void main(String[] args) {
        WithoutSingleton withoutSingleton1 = new WithoutSingleton();
        WithoutSingleton withoutSingleton2 = new WithoutSingleton();

        // here we created two objects which are able to get the same data using two diff objects
        // this way we are creating diff objects but accessing the same data.
        System.out.println(withoutSingleton1.getUrl());
        System.out.println(withoutSingleton2.getUrl());

        // these two are diff objects not same
        System.out.println(withoutSingleton1==withoutSingleton2);
    }
}
