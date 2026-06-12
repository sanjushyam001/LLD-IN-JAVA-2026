package patterns.protectionproxy;

public class PdfDcumentReader implements IDocumentReader {

    @Override
    public void unlockDocument(String url, String password) {
        if (!(url == "abcd.jpg" && password.equals("1234"))) {

            System.out.println("Resource is protected,Unsuccessfully read!");
            return;
        }
        System.out.println("Resource is unlocked,successfully read!");

    }

}
