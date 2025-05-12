package clase;

public class CardBancar implements IMetodaPlata {
    private float sold;

    public CardBancar(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold >= pretBilet){
            sold = sold-pretBilet;
            System.out.println("Plata a fost efectuata");
        }else{
            System.out.println("Ne pare rau, plata nu a putu fi efectuata");
        }
    }
}
