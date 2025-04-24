package Main;

import FactoryClasses.ComponentaFactory;
import FactoryClasses.IComponenta;
import FactoryClasses.TipComponenta;
import Prototypeclasses.ASticker;
import Prototypeclasses.Sticker;

public class Main {
    public static void main(String[] args) {
        ASticker sticker = new Sticker("BMW","2006");
        ASticker sticker1 = sticker.clone();
        System.out.println(sticker.toString());
        System.out.println(sticker1.toString());

        ComponentaFactory factory = new ComponentaFactory();
        IComponenta Capota = factory.getComponenta(TipComponenta.CAPOTA);
        Capota.denumireComponenta();
        IComponenta Usa = factory.getComponenta(TipComponenta.USA);
        IComponenta Bara = factory.getComponenta(TipComponenta.BARAFATA);
        Usa.denumireComponenta();
        Bara.denumireComponenta();


    }
}
