package clase;

public abstract class AOcupareStadion {
    public abstract void asezareLaCoada();
    public abstract void prezentareBilet();
    public abstract  void control();
    public abstract  void intrare();
    public abstract  void ocupareLoc();

    public final void intrareStradion(){
        asezareLaCoada();
        prezentareBilet();
        control();
        intrare();ocupareLoc();
    }
}
