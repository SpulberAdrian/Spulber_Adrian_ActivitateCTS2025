package clase;

public class InformatiiCont {
    private String nume;
    private String adresa;
    private String telefon;
    private String mail;

    public InformatiiCont(String nume, String adresa, String telefon, String mail) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InformatiiCont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
