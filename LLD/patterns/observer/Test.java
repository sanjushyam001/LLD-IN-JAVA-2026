package patterns.observer;

public class Test {
    public static void main(String[] args) {

        Observer shyam = new User("Shyam Sunder");
        Observer yuvi = new User("Yuvi Singh");

        Channel channel = new Channel();
        channel.subscribe(shyam);
        channel.subscribe(yuvi);

        channel.uploadVideo("Daily House Vlog 2");
    }
}
