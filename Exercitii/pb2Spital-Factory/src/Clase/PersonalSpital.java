package Clase;

public abstract class PersonalSpital {
    private int varsta;
    private int salariu;

    public PersonalSpital(int varsta, int salariu) {
        this.varsta = varsta;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clase.PersonalSpital{");
        sb.append("varsta=").append(varsta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

}
