package clase;

public abstract class InternarePacient {
    public final void interneaza(){
        analizeazaStare();
        verificaDisponibilitateSalon();
        emiteFisaInternare();
    }

    protected abstract void analizeazaStare();
    protected  abstract  void  verificaDisponibilitateSalon();

    protected  void emiteFisaInternare(){
        System.out.println("S-a emis fisa de internare");
    }
}
