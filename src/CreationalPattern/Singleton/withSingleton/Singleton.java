package CreationalPattern.Singleton.withSingleton;

public class Singleton {
    private String getUrl;
    private String getPort;

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance==null){
            instance = new Singleton(); // we will only get this instance only once
        }
        return instance;
    }

    public String getGetUrl() {
        return getUrl;
    }

    public String getGetPort() {
        return getPort;
    }
}
