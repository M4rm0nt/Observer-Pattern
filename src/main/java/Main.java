public class Main {

    public static void main(String[] args) {

        NachrichtenAgentur agentur = new NachrichtenAgentur();

        NachrichtenLeser leser1 = new NachrichtenLeser("Leser 1");
        NachrichtenLeser leser2 = new NachrichtenLeser("Leser 2");
        NachrichtenLeser leser3 = new NachrichtenLeser("Leser 3");

        agentur.hinzufuegen(leser1);
        agentur.hinzufuegen(leser2);
        agentur.hinzufuegen(leser3);

        agentur.setNachricht("Eilmeldung: Observer Pattern in Java!");

        agentur.entfernen(leser2);

        agentur.setNachricht("Eilmeldung: Observer Pattern in Java!");
    }

}
