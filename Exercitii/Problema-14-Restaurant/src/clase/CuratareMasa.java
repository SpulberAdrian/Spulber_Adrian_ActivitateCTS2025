package clase;

public class CuratareMasa extends Handler{
    @Override
    public void ocupaMasa() {
        System.out.println("Masa a fost curatata");
        if(next!= null){
            next.ocupaMasa();
        }
    }
}
