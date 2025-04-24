package ClaseFactory;

import ClaseFactory.AFactory;

public class FabricaFacturaNefiscala extends AFactory {
    @Override
    public IFactura2 elibereazaFactura() {
        return new FacturaNefiscala();
    }
}
