package clase;

public class InternareAdult extends  InternarePacient{
    @Override
    protected void analizeazaStare() {
        System.out.println("Se analizeaza starea pacientului");
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Se verifica disponibilitatea in salonul pentru adulti");
    }
}
