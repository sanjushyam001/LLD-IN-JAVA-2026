package googledocs;
import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<DocumentElement> documentElements = new ArrayList<>();

    public void addText(String text) {
        documentElements.add(new TextDocumentElement(text));
    }

    public void addImage(String imagePath) {
        documentElements.add(new ImageDocumentELement(imagePath));
    }

    public String render() {

        String result = "";
        for (DocumentElement e : documentElements) {
            result += e.render();
        }
        return result;
    }

}
