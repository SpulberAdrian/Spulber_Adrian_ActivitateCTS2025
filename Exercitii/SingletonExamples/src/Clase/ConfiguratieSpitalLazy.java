package Clase;

public class ConfiguratieSpitalLazy {
    private static ConfiguratieSpitalLazy instanta = null;
    private String denumire;
    private int nrDepartamente;

    private ConfiguratieSpitalLazy(String denumire, int nrDepartamente) {
        this.denumire = denumire;
        this.nrDepartamente = nrDepartamente;
    }

    public static ConfiguratieSpitalLazy getInstanta( String denumire, int nrDepartamente){
        if(instanta == null){
            instanta = new ConfiguratieSpitalLazy(denumire,nrDepartamente);
        }
        return instanta;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.ConfiguratieSpitalLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrDepartamente=").append(nrDepartamente);
        sb.append('}');
        return sb.toString();
    }
}
