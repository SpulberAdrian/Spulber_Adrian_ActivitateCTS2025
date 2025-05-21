package clase;

public class PlataCardStar extends Handler{
    @Override
    public void plateste() {
        System.out.println("Plata se va face cu cardul Star");
        if(next == null) {
            System.out.println("Plata esuata");
        }
    }
}
