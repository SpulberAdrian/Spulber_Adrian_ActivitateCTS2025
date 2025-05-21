package clase;

public class VerificariFacade {
    private VerficareVarsta verificare;
    private UrmaritDePolitie urmarire;
    private Creante creanteExistente;

    public VerificariFacade() {
        this.verificare = new VerficareVarsta();
        this.urmarire = new UrmaritDePolitie();
        this.creanteExistente = new Creante();
    }

    public boolean esteEligibil(int varsta){
        return verificare.verificaVarsta() && urmarire.verificareUrmarirePolitie() && creanteExistente.verificareCreante();
    }
}
