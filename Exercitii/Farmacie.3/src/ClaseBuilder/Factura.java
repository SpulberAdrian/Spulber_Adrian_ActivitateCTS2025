package ClaseBuilder;

public class Factura {
    private int nrPungi;
    private Boolean plataCard;
    private Boolean cardFidelitate;
    private int cotaTVA;

    public Factura(int nrPungi, Boolean plataCard, Boolean cardFidelitate, int cotaTVA) {
        this.nrPungi = nrPungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClaseBuilder.Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
