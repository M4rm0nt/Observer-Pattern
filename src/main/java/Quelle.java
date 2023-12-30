public interface Quelle {
    void hinzufuegen(Beobachter beobachter);
    void entfernen(Beobachter beobachter);
    void benachrichtigen(String nachricht);
}
