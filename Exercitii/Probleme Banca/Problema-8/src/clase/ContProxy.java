package clase;

public class ContProxy implements ICreare{
    private ContBancar cont;

    public ContProxy(ContBancar cont) {
        this.cont = cont;
    }

    @Override
    public void creareContBancar(String moneda) {
        if(moneda.equals("RON")){
            cont.creareContBancar(moneda);
        }else{
            System.out.println("Nu se pot crea conturi decat in moneda RON");
        }
    }
}
