package ClaseFactory;

public class FacturaFactory {

    public IFactura2 getFactura(TipFactura tip){
        switch (tip){
            case TipFactura.FISCALA : return new FacturaFiscala();
            case TipFactura.NEFISCALA: return  new FacturaNefiscala();
            default : throw new IllegalArgumentException("n-avem");
        }
    }
}
