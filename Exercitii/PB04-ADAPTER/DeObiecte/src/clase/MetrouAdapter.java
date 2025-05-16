package clase;

public class MetrouAdapter implements ValidatorTransport {
    MetrouValidator metrou;

    public MetrouAdapter(MetrouValidator metrou) {
        this.metrou = metrou;
    }

    @Override
    public void valideazaBilet() {
        metrou.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
    metrou.valideazaCalatorie();
    }
}
