package clase;

public class InformatiiCaracter {
    private  int inaltime;
    private int latime;
    private  String culoareTricou;
    private  int pozitie;

    public InformatiiCaracter(int inaltime, int latime, String culoareTricou, int pozitie) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.culoareTricou = culoareTricou;
        this.pozitie = pozitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InformatiiCaracter{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", latime=").append(latime);
        sb.append(", culoareTricou='").append(culoareTricou).append('\'');
        sb.append(",pozitie=").append(pozitie);
        sb.append('}');
        return sb.toString();
    }
}
