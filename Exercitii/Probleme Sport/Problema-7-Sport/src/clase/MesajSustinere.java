package clase;

public class MesajSustinere extends Decorator{

    public MesajSustinere(IMesajBilet mesaj) {
        super(mesaj);
    }

    public void afiseaza(){
        super.afiseaza();
        System.out.println("HAI ROMANIA!");
    }
}
