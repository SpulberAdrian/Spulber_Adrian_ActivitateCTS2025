public class Trekking extends Bicicleta{
    private int grosimeRoti;
    public Trekking(int diametruRoti, String tipFrana, Boolean cascaProtectie, Boolean ochelari, int grosimeRoti) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.grosimeRoti = grosimeRoti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trekking{");
        sb.append("grosimeRoti=").append(grosimeRoti);
        sb.append('}');
        return sb.toString();
    }
}
