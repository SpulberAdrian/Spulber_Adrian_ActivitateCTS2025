package clase;

public abstract class CardDecorator implements Card {
    protected  Card card;

    public CardDecorator(Card card) {
        this.card = card;
    }

    public void plateste(){
        card.plateste();
    }

}
