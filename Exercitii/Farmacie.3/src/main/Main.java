package main;

import ClaseBuilder.Factura;
import ClaseBuilder.FacturaBuilder;
import ClaseBuilder.IFactura;

public class Main {
    public static void main(String[] args) {
        IFactura builder = new FacturaBuilder();
        Factura factura1 =  builder.nrPungi(10).cardFidelitate(false).plataCard(false).buildFactura();

        FacturaFactory fabrica = new FacturaFactory();
        IFactura2 factura = fabrica.getFactura(TipFactura.FISCALA);
        System.out.println(factura.descriere());


        AFactory creator = new FabricaFacturaFiscala();
        IFactura2 facturaFiscala = creator.elibereazaFactura();

        creator = new FabricaFacturaNefiscala();
        IFactura2 facturaNefiscala = creator.elibereazaFactura();

        System.out.println(facturaFiscala.descriere());
        System.out.println(facturaNefiscala.descriere());

    }
}
