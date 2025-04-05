package Clase;

public class Medic extends PersonalSpital {
    private int spor;
    public Medic(int varsta, int salariu, int spor) {
        super(varsta, salariu);
        this.spor = spor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.Medic{");
        sb.append("spor=").append(spor);
        sb.append('}');
        return sb.toString();
    }


}
