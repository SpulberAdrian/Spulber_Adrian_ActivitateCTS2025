public class Electrica extends Bicicleta{
    private int autonomie;
    public Electrica(int diametruRoti, String tipFrana, Boolean cascaProtectie, Boolean ochelari, int autonomie) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.autonomie = autonomie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Electrica{");
        sb.append("autonomie=").append(autonomie);
        sb.append('}');
        return sb.toString();
    }
}
