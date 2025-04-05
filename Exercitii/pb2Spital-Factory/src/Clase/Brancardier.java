package Clase;

public class Brancardier extends PersonalSpital {

    private int spor;
    public Brancardier(int varsta, int salariu, int spor) {
        super(varsta, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.Brancardier{");
        sb.append("spor=").append(spor);
        sb.append('}');
        return sb.toString();
    }
}
