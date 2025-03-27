package clase;

public abstract class FelMancare {

    float pret;
    int nrCalorii;

    public FelMancare(float pret, int nrCalorii) {
        this.pret = pret;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelMancare{");
        sb.append("pret=").append(pret);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}
