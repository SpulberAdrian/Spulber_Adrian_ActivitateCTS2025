package clase;

public class Troleibuz extends  Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 3){
            System.out.println("O sa calatoriti cu troleibuzul");
        }else if(next != null) {
            next.recomanda(distanta);
        }else {
            System.out.println("ne pare rau");
        }
    }
}
