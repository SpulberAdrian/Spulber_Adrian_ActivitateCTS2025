package clase;

public class Autobuz extends  Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 5){
            System.out.println("Recomandam transportul cu autobuzul");
        }
        else if (next != null) {
            next.recomanda(distanta);
        }
        else{
            System.out.println("Ne pare rau");
        }
    }
}
