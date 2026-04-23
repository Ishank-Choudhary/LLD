package CreationalPattern.Singleton.withoutSingleton;

public class WithoutSingleton {
    private String url;
    private int port;

    public WithoutSingleton() {
        url = "www.google.com";
        port = 3445;
    }

    public String getUrl() {
        return url;
    }

    public int getPort() {
        return port;
    }
}
