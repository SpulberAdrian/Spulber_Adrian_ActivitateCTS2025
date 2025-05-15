package clase;

public class MetrouSpecial extends AMetrou{
    private int nrMetrou;

    public MetrouSpecial(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Aceasta statie este in renovare");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul a oprit in statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Aceasta statie este in renovare");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul a oprit in statia 4");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul a oprit in statia 5");
    }
}
