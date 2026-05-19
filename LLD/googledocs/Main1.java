package googledocs;

public class Main1 {
    public static void main(String[] args) {

        Document document = new Document();
        Persistant filePersistant = new FilePersistant();
        Persistant dbPersistant = new DatabasePersistant();
        DocumentEditor1 editor1 = new DocumentEditor1(document, filePersistant);
        editor1.addText("Name: Sanjeev \n");
        editor1.addImage("Elephant.jpeg");
        editor1.reviewDocument();
        editor1.saveDocument();
    }
}
