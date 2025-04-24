public class Main {
    public static void main(String[] args) {
        BicicletaFactory factory = new BicicletaFactory();
        IBicicleta MTB = factory.creazaBicicleta(TipBicicleta.MTB,29,"Hidraulica", true, true);
        System.out.println(MTB.toString());
        System.out.println(MTB.VitezaMaxima());
    }
}
