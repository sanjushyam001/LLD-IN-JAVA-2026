package googledocs;
public class ImageDocumentELement implements DocumentElement {

    private String imagePath;

    public ImageDocumentELement(String imagePath) {
        this.imagePath = imagePath;
    }

    public String render() {
        return imagePath + " This image is rendered \n ";
    }
}
