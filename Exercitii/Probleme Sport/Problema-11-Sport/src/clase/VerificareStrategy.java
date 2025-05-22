package clase;

public class VerificareStrategy implements Verificare{
    private Verificare verificare;

    public void setVerificare(Verificare verificare){
        this.verificare = verificare;
    }
    @Override
    public void verificare() {
        verificare.verificare();
    }
}
