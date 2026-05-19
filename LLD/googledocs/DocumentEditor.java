package googledocs;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

    private static List<String> documentElements = new ArrayList<>();

    public static void addText(String text) {
        documentElements.add(text);
    }

    public static void addImage(String path) {
        documentElements.add(path);

    }

    private static String render() {
        String result = "";
        for (String document : documentElements) {
            result += document + "\n";
        }
        // System.out.println("DOCUMENT \n" + result);
        return result;

    }

    public static void print() {
        System.out.println("Print document: \n " + render());
    }

    public static void saveToFile(String result) {
        System.out.println("Document saved to file: " + render());
    }
}
