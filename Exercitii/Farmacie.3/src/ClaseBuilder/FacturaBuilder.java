package ClaseBuilder;

public class FacturaBuilder implements IFactura {

    private int nrPungi;
    private Boolean plataCard;
    private Boolean cardFidelitate;
    private int cotaTVA;

    @Override
    public Factura buildFactura() {
        return new Factura(nrPungi,plataCard,cardFidelitate,cotaTVA) ;
    }

    @Override
    public IFactura nrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    @Override
    public IFactura plataCard(Boolean plataCard) {
        this.plataCard = plataCard;
        return this;
    }

    @Override
    public IFactura cardFidelitate(Boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
        return this;
    }

    @Override
    public IFactura cotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }
}
