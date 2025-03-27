package fabrici;

import clase.FelMancare;
import clase.SupaCiuperci;
import clase.SupaLegume;

public class SupaFactory implements TipMancareFactory {
       private int cantitate;

    public SupaFactory(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, int pret, int nrCalorii) {
        return switch (tip){
            case Supa.SupaCiuperci -> new SupaCiuperci(pret,nrCalorii,this.cantitate);
            case Supa.SupaLegume -> new SupaLegume(nrCalorii, pret, this.cantitate);
            case default -> null;
        }
    }
}
