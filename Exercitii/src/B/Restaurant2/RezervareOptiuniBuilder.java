package B.Restaurant2;

public class RezervareOptiuniBuilder {

    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private Boolean muzicaAmbientala;
    private String genMuzica;

    public RezervareOptiuniBuilder setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareOptiuniBuilder setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareOptiuniBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareOptiuniBuilder setMuzicaAmbientala(Boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareOptiuniBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }


    public RezervareOptiuni build(){
        return new RezervareOptiuni(asezareGeam,scauneErgonomice,decorareMasa,muzicaAmbientala,genMuzica);
    }
}
