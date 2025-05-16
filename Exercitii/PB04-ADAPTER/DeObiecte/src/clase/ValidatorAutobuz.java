package clase;

public class ValidatorAutobuz implements ValidatorTransport{
    @Override
    public void valideazaBilet() {
        System.out.println("Ati platit biletul");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Ati folosit abonamentul");
    }
}
