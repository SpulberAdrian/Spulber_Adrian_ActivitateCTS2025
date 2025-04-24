public class MTB extends Bicicleta{
    private Boolean rotiRezistsenteLaIntepaturi;

    public void setRotiRezistsenteLaIntepaturi(Boolean rotiRezistsenteLaIntepaturi) {
        this.rotiRezistsenteLaIntepaturi = rotiRezistsenteLaIntepaturi;
    }

    public MTB(int diametruRoti, String tipFrana, Boolean cascaProtectie, Boolean ochelari, Boolean rotiRezistsenteLaIntepaturi) {
        super(diametruRoti, tipFrana, cascaProtectie, ochelari);
        this.rotiRezistsenteLaIntepaturi = rotiRezistsenteLaIntepaturi;
    }

    @Override
    public String toString() {
        return super.toString() + ", roti rezistente: " + rotiRezistsenteLaIntepaturi;
    }
}
