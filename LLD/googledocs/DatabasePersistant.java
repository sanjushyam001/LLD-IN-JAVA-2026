package googledocs;
public class DatabasePersistant implements Persistant {

    @Override
    public void save(String renderDocument) {

        System.out.println(renderDocument + " is saved to database ..");

    }
}
