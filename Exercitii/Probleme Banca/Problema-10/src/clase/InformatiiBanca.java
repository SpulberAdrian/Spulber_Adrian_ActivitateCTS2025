package clase;

public class InformatiiBanca {
    private String nume;
    private String sucursala;
    private int capital;
    private InformatiiCont cont;

    public InformatiiBanca(String nume, String sucursala, int capital, InformatiiCont cont) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.capital = capital;
        this.cont = cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InformatiiBanca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(",cont = ").append(cont.toString());
        sb.append('}');
        return sb.toString();
    }
}
