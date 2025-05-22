package clase;

public class OcupareStadion extends AOcupareStadion{
    @Override
    public void asezareLaCoada() {
        System.out.println("se aseaza la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println("se prezinta biletul");
    }

    @Override
    public void control() {
        System.out.println("se controleaza biletul");
    }

    @Override
    public void intrare() {
        System.out.println("se intra");
    }

    @Override
    public void ocupareLoc() {
        System.out.println("se ocupa locul");
    }
}
