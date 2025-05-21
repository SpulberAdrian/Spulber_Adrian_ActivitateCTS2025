package clase;

public abstract class Decorator  implements IMesajBilet{
    private IMesajBilet mesaj;

    public Decorator(IMesajBilet mesaj) {
        this.mesaj = mesaj;
    }

    public void afiseaza(){
        mesaj.afiseaza();
    };
}
