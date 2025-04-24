package Clase;

public class Bicicleta implements  IBicicleta{

    private int diametruRoti;
    private String tipFrana;
    private Boolean cascaProtectie;
    private Boolean ochelari;

    public Bicicleta(int diametruRoti, String tipFrana, Boolean cascaProtectie, Boolean ochelari) {
        this.diametruRoti = diametruRoti;
        this.tipFrana = tipFrana;
        this.cascaProtectie = cascaProtectie;
        this.ochelari = ochelari;
    }

    @Override
    public String VitezaMaxima() {
        return "Viteza maxima a bicicletei este 25km/h";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.Bicicleta{");
        sb.append("diametruRoti=").append(diametruRoti);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", cascaProtectie=").append(cascaProtectie);
        sb.append(", ochelari=").append(ochelari);
        sb.append('}');
        return sb.toString();
    }
}
