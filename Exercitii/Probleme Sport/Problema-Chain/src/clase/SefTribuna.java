package clase;

public class SefTribuna extends Handler{
    @Override
    public void gestionare() {
        System.out.println("va adresati sefului de tribuna");
        if(next != null){
            next.gestionare();
        }
    }
}
