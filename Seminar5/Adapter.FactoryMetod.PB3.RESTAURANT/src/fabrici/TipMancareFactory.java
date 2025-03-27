package fabrici;

import clase.FelMancare;

public interface TipMancareFactory {
    FelMancare preparareFelMancare(TipFelMancare tip, int pret, int nrCalorii);
}
