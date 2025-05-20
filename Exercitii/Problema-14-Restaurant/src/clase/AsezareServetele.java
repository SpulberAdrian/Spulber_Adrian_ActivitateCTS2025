package clase;

public class AsezareServetele extends Handler{
    @Override
    public void ocupaMasa() {
        System.out.println("S-au asezat servetelele");
        if(next != null){
            next.ocupaMasa();
        }
    }
}
