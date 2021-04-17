import java.io.*;
import java.util.ArrayList;

public class Personenmanager {
    private ArrayList<Person> persons;

    public Personenmanager() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void savePerson(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)); BufferedOutputStream bos = new BufferedOutputStream(oos)) {

            for (Person person : persons) {
                oos.writeObject(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadPerson(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)); BufferedInputStream bof = new BufferedInputStream(ois)) {
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
