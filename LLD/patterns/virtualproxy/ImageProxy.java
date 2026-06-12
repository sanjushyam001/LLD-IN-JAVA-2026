package patterns.virtualproxy;

public class ImageProxy implements IDisplay {

    private IDisplay imageDisplay = null;
    private String url;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void display() {

        if (imageDisplay == null)
            imageDisplay = new ImageDisplay(url);
        imageDisplay.display();
    }

}
