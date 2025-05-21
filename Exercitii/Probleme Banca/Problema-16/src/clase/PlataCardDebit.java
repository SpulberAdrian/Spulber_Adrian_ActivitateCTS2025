package clase;

public class PlataCardDebit extends Handler{
    @Override
    public void plateste() {
        System.out.println("Plata se va efectua cu cardul de debit");
        if(next != null){
            next.plateste();
        }
    }
}
