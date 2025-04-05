package Clase;

public class PersonalFactory {

    private int spor;

    public PersonalFactory(int spor) {
        this.spor = spor;
    }

    public void setSpor(int spor) {
        this.spor = spor;
    }

    public  PersonalSpital AngajeazaPersonal(TipPersonal tip, int varsta, int salariu) {
        if( tip instanceof Personal personal) {
           return switch (personal) {
                case BRANCARDIER -> new Brancardier(varsta, salariu,this.spor);
                case ASISTENT -> new Asistent(varsta, salariu,this.spor);
                case MEDIC -> new Medic(varsta, salariu,this.spor);
            };

        }
        return null;
    }
}
