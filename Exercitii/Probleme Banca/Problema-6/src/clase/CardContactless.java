package clase;

public class CardContactless extends CardDecorator {
    public CardContactless(Card card) {
        super(card);
    }

    public void plateste(){
        super.plateste();
        System.out.println("Ati folosit cardul contactless pentru plata");
    }
}
