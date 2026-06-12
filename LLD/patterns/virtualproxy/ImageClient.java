package patterns.virtualproxy;

public class ImageClient {
    public static void main(String[] args) {

        IDisplay imageProxy = new ImageProxy("d://p.jpg");
        imageProxy.display();
        imageProxy.display();
        imageProxy.display();
        imageProxy.display();
    }
}
