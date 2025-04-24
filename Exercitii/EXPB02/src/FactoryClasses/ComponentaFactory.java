package FactoryClasses;

public class ComponentaFactory {

    public static IComponenta getComponenta(TipComponenta tip){
        switch (tip) {
            case USA : return new Usa();
            case BARAFATA : return new BaraFata();
            case CAPOTA : return new Capota();
            default : throw  new IllegalArgumentException("N-avem dastea");

        }
    }
}
