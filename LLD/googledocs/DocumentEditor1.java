package googledocs;

import googledocs.Document;

public class DocumentEditor1 {

    private Document document;
    private Persistant persistant;
    private String renderDocument;

    public DocumentEditor1(Document document, Persistant persistant) {

        this.document = document;
        this.persistant = persistant;

    }

    public void addText(String text) {
        document.addText(text);
    }

    public void addImage(String imagePath) {
        document.addImage(imagePath);
    }

    public String renderDocument() {
        return document.render();
    }

    public void reviewDocument() {
        System.out.println("----- REVIEW -----");
        System.out.println(document.render());
    }

    public void saveDocument() {
        persistant.save(document.render());
    }

}
