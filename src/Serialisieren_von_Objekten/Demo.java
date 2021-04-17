package Serialisieren_von_Objekten;

public class Demo {
    public static void main(String[] args) {
        Person Niki = new Person("Niki", "Kachelmaier", 22);
        Person Hannes = new Person("Hannes", "Temmel", 28);
        Person Lena = new Person("Lena", "Musterfrau", 18);

        Personenmanager pm = new Personenmanager();

        pm.addPerson(Niki);
        pm.addPerson(Hannes);
        pm.addPerson(Lena);

        pm.savePerson("C:\\Users\\nikikachelmaier\\Desktop\\personen.txt");

    }
}
