public class BicicletaFactory {

    public Bicicleta creazaBicicleta(TipBicicleta tip,int diametruRoti, String tipFrana, Boolean cascaProtectie, Boolean ochelari){
          switch (tip){
            case MTB -> {return new MTB(diametruRoti, tipFrana, true, true, true);}
              case Electrica -> { return new Electrica(diametruRoti,tipFrana,cascaProtectie,ochelari,50);}
              case Trekking -> { return new Trekking(diametruRoti,tipFrana,cascaProtectie,ochelari,24);}
              default -> throw new IllegalArgumentException("Tip Necunoscut");
            }
    }
}
