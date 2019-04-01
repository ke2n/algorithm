package designPattern.Singleton;

public class SystemSpeaker {

    private int volume;

    private SystemSpeaker() {
        System.out.println("new SystemSpeaker()");
        this.volume = 5;
    }

    public static SystemSpeaker getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {

        private static final SystemSpeaker INSTANCE = new SystemSpeaker();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
