public class NachrichtenLeser implements Beobachter {
    private String name;

    public NachrichtenLeser(String name) {
        this.name = name;
    }

    @Override
    public void aktualisieren(String nachricht) {
        System.out.println(name + " hat die Nachricht erhalten: " + nachricht);
    }
}
