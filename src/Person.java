import java.io.Serializable;

public class Person  implements Serializable {
    private String Vorname, Nachname;
    private int Alter;

    public Person(String vorname, String nachname, int alter) {
        Vorname = vorname;
        Nachname = nachname;
        Alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Vorname='" + Vorname + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", Alter=" + Alter +
                '}';
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getAlter() {
        return Alter;
    }
}
