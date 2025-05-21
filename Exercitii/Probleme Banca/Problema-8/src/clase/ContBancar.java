package clase;

public class ContBancar implements  ICreare{
    @Override
    public void creareContBancar(String moneda) {
        System.out.println("Contul bancar in moneda "+ moneda +" a fost creat");
    }
}
