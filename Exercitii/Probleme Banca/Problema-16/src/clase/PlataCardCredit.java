package clase;

public class PlataCardCredit extends  Handler{
    @Override
    public void plateste() {
        System.out.println("Plata se va face cu cardul de Credit");
        if(next != null){
            next.plateste();
        }
    }
}
