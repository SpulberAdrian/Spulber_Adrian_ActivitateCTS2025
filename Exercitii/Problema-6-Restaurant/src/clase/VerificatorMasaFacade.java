package clase;

public class VerificatorMasaFacade {
    private Masa masa;
    private Debarasare debarasare;
    private Servetele servetele;

    public VerificatorMasaFacade() {
        this.masa = new Masa();
        this.debarasare = new Debarasare();
        this.servetele = new Servetele();
    }

    public boolean poateFiOcupapta(int nrMasa){
        return masa.esteLibera(nrMasa) && debarasare.esteDebarasata(nrMasa)
                && servetele.areServetele(nrMasa);
    }
}
