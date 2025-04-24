package Clase;

public class ConfiguratieScoalaEager {

    private static ConfiguratieScoalaEager instanta = new ConfiguratieScoalaEager();
    private String denumire;
    private int nrSali;



    private ConfiguratieScoalaEager() {
        this.denumire = "Scoala Generala nr 9";
        this.nrSali = 14;
    }

    public static ConfiguratieScoalaEager getInstanta(){
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.ConfiguratieScoalaEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrSali=").append(nrSali);
        sb.append('}');
        return sb.toString();
    }
}
