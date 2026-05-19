package googledocs;
public class FilePersistant implements Persistant {

    @Override
    public void save(String renderDocument) {

        System.out.println(renderDocument + " is saved to file ..");

    }
}
