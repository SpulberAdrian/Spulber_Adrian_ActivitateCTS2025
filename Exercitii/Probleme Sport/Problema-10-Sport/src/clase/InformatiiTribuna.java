package clase;

public class InformatiiTribuna {
    private String tribuna;
    private InformatiiCaracter informatiiCaracter;

    public InformatiiTribuna(String locTribuna, InformatiiCaracter informatiiCaracter) {
        this.tribuna = locTribuna;
        this.informatiiCaracter = informatiiCaracter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InformatiiTribuna{");
        sb.append("locTribuna='").append(tribuna).append('\'');
        sb.append("Informatii Caracter").append(informatiiCaracter.toString());
        sb.append('}');
        return sb.toString();
    }
}
