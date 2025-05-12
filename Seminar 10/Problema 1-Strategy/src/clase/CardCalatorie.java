package clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatoriiRamase;

    public CardCalatorie(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatoriiRamase > 0){
            nrCalatoriiRamase--;
            System.out.println("Mai aveti " + nrCalatoriiRamase +"Calatorii ramase");
        }else{
            System.out.println("nu mai aveti calatorii");
        }
    }
}
