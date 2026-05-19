package googledocs;
public class TextDocumentElement implements DocumentElement {

    private String text;

    public TextDocumentElement(String text) {
        this.text = text;
    }

    public String render() {
        return text + " This text is rendered \n ";

    }
}
