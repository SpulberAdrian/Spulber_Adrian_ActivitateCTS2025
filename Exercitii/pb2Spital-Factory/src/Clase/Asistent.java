package Clase;

public class Asistent  extends PersonalSpital {
    private int spor;

    public Asistent(int varsta, int salariu, int spor) {
        super(varsta, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.Asistent{");
        sb.append("spor=").append(spor);
        sb.append('}');
        return sb.toString();
    }
}
