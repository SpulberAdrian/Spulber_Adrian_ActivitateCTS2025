package clase;

public class PlataSMS implements  IMetodaPlata{

    private float credit;

    public PlataSMS(float credit) {
        this.credit = credit;
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin SMS. ");
    }
}
