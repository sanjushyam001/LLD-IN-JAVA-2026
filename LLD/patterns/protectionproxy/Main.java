package patterns.protectionproxy;

public class Main {

    public static void main(String[] args) {

        User rahul = new User("rahulsharma", "1234", "rahul@y.in", "premium");
        User pankaj = new User("pankajkumar", "1234", "pankaj@y.in", "normal");

        IDocumentReader documentProxy = new DocumentReaderProxy(rahul);
        documentProxy.unlockDocument("abcd.jpg", "1234");

    }
}
