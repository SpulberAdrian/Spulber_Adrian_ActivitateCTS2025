package clase;

public class VerificatorCentralizat {
    private VerificareNume verificareNume;
    private VerificarePolitie verificarePolitie;
    private Antecedente antecedente;

    public VerificatorCentralizat() {
        this.verificareNume = new VerificareNume();
        this.verificarePolitie = new VerificarePolitie();
        this.antecedente = new Antecedente();
    }

    public boolean verificareCentralizata(){
        return verificareNume.verificareNume() && verificarePolitie.verificarePolitie() && antecedente.verificareAntecedente();
    }
}
