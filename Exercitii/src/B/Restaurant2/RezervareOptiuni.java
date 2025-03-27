package B.Restaurant2;

public class RezervareOptiuni {
   private Boolean asezareGeam;
   private Boolean scauneErgonomice;
   private Boolean decorareMasa;
   private Boolean muzicaAmbientala;
   private String geMuzica;

    public Boolean getAsezareGeam() {
        return asezareGeam;
    }

    public Boolean getScauneErgonomice() {
        return scauneErgonomice;
    }

    public Boolean getDecorareMasa() {
        return decorareMasa;
    }

    public Boolean getMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public String getGenMuzica() {
        return geMuzica;
    }

     RezervareOptiuni(Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareMasa, Boolean muzicaAmbientala, String geMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.geMuzica = geMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareOptiuni{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", geMuzica='").append(geMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
