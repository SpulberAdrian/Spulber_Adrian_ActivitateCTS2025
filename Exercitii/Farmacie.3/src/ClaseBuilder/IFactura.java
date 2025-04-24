package ClaseBuilder;

public interface IFactura {
    Factura buildFactura();
    IFactura nrPungi(int nrPungi);
    IFactura plataCard(Boolean plataCard);
    IFactura cardFidelitate(Boolean cardFidelitate);
    IFactura cotaTVA(int cotaTVA);
}
