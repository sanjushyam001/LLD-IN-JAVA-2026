package patterns.protectionproxy;

public class DocumentReaderProxy implements IDocumentReader {

    private IDocumentReader documentReader = new PdfDcumentReader();

    private User user;

    public DocumentReaderProxy(User user) {
        this.user = user;

    }

    private void validateUser() {

        if (!(user.getUserType().equals("premium"))) {
            System.out.println("User is not Premium please upgrade!");
            return;
        }

    }

    @Override
    public void unlockDocument(String url, String password) {
        validateUser();
        documentReader.unlockDocument(url, password);
    }

}
