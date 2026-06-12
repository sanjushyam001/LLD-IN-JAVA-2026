package patterns.virtualproxy;

public class ImageDisplay implements IDisplay {

    private String path;

    public ImageDisplay(String path) {
        this.path = path;

        System.out.println("load from disk .. ");
        System.out.println("compression .. ");
        System.out.println("validation .. ");
        System.out.println("filter .. ");
    }

    @Override
    public void display() {

        System.out.println("Image is displaying .." + path);
    }

}
