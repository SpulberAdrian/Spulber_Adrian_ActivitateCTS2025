package clase;

public class InternareCopil extends InternarePacient{
    @Override
    protected void analizeazaStare() {
        System.out.println("Se verifica starea copilului");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Se verifica disponibilitatea salonului in aripa de pediatrie");
    }
}
