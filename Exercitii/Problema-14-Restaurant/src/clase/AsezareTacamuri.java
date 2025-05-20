package clase;

public class AsezareTacamuri extends Handler{
    @Override
    public void ocupaMasa() {
        System.out.println("S-au asezat tacamurile");
        if(next != null){
            next.ocupaMasa();
        }
    }
}
