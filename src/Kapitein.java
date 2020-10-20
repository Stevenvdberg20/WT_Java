public class Kapitein {
    String voornaam;

    public Kapitein(String voornaam) {
        this.voornaam = voornaam;
    }

    public void varen(Boot boot) {
        boot.starten();
    }
}
