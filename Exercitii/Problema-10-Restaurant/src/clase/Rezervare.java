package clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int oraRezervare;
    private Client client;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezervare, Client client) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
        this.client = client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", client=").append(client);
        sb.append('}');
        return sb.toString();
    }
}
