package googledocs;

public class Main {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();
        editor.addText("Name: Sanjeev");
        editor.addImage("Elephant.jpeg");

        editor.print();
        editor.saveToFile(null);
    }
}
