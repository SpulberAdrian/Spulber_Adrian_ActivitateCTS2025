package clase;

public class SefPeluza extends Handler{
    @Override
    public void gestionare() {
        System.out.println("Va adresati sefului de peluza");
        if(next != null){
            next.gestionare();
        }
    }
}
