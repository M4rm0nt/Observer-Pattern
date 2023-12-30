import java.util.ArrayList;
import java.util.List;

public class NachrichtenAgentur implements Quelle {

    private final List<Beobachter> beobachterListe = new ArrayList<>();

    public void setNachricht(String nachricht) {
        benachrichtigen(nachricht);
    }

    @Override
    public void hinzufuegen(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    @Override
    public void entfernen(Beobachter beobachter) {
        beobachterListe.remove(beobachter);
    }

    @Override
    public void benachrichtigen(String nachricht) {
        for(Beobachter beobachter : beobachterListe) {
            beobachter.aktualisieren(nachricht);
        }
    }
}
