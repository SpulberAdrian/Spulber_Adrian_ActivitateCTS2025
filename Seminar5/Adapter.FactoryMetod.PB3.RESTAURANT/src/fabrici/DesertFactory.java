package fabrici;

import clase.Clatite;
import clase.FelMancare;
import clase.Papanasi;

public class DesertFactory implements TipMancareFactory{

    private String crema;

    public DesertFactory(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare preparareFelMancare(TipFelMancare tip, int pret, int nrCalorii) {
        return switch (tip){
            case Desert.Papanasi -> new Papanasi(pret,nrCalorii,crema);
            case Desert.Clatite -> new Clatite(pret, nrCalorii, crema);
            case default -> null;
        }
    }

    



}
