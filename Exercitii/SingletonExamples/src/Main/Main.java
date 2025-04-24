package Main;

import Clase.ConfiguratieScoalaEager;
import Clase.ConfiguratieSpitalLazy;

public class Main {
    public static void main(String[] args) {
        ConfiguratieSpitalLazy configuratieSpitalLazy = ConfiguratieSpitalLazy.getInstanta("Spitalul Judetean Vrancea", 13);
        System.out.println(configuratieSpitalLazy.toString());
        ConfiguratieSpitalLazy configuratieSpitalLazy1  = ConfiguratieSpitalLazy.getInstanta("Spitalul Colentina",5);
        System.out.println(configuratieSpitalLazy1.toString());

        ConfiguratieScoalaEager configuratieScoala = ConfiguratieScoalaEager.getInstanta();
        System.out.println(configuratieScoala.toString());
    }
}
