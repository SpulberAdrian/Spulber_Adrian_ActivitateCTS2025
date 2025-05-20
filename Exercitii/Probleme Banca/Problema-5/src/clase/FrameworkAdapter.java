package clase;

public class FrameworkAdapter implements  Oferta{
    FrameworkNou frameworkNou;

    public FrameworkAdapter(FrameworkNou frameworkNou) {
        this.frameworkNou = frameworkNou;
    }

    @Override
    public void afisareOferta() {
        frameworkNou.afisareMesaj();
    }
}
