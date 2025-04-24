package Classes;

public class Medicament extends AMedicament {
    @Override
    public void descriere() {
        System.out.println("Acesta este un medicament");
    }

    @Override
    public AMedicament clone() {
        Medicament medicament = new Medicament(this.denumire,this.cantitateSubstantaActiva,this.cantitateSubstantaSecundara,this.adaugari);
        medicament.denumire = this.denumire;
        medicament.cantitateSubstantaActiva = this.cantitateSubstantaActiva;
        medicament.cantitateSubstantaSecundara = this.cantitateSubstantaSecundara;
        medicament.adaugari = this.adaugari;
        return medicament;
    }

    public Medicament(String denumire, int cantitateSubstantaActiva, int cantitateSubstantaSecundara, String adaugari) {
        super(denumire, cantitateSubstantaActiva, cantitateSubstantaSecundara, adaugari);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Classes.Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitateSubstantaActiva=").append(cantitateSubstantaActiva);
        sb.append(", cantitateSubstantaSecundara=").append(cantitateSubstantaSecundara);
        sb.append(", adaugari='").append(adaugari).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
