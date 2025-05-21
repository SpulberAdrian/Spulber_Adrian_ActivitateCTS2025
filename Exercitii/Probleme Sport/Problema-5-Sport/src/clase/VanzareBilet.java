package clase;

public class VanzareBilet implements IVanzareBilet{
    @Override
    public void vanzare() {
        System.out.println("Se vinde biletul pe platforma proprie");
    }
}
