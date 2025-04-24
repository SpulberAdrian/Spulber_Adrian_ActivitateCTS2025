package ClaseFactory;

import ClaseFactory.AFactory;

public class FabricaFacturaFiscala extends AFactory {
    @Override
    public IFactura2 elibereazaFactura() {
        return new FacturaFiscala();
    }
}
