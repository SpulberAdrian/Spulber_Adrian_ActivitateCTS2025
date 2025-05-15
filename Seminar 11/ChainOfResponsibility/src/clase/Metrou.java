package clase;

public class Metrou extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta >= 10){
            System.out.println("Veti calatori cu metroul");
        }else{
            System.out.println("Nu avem mijloc de transport");
        }
    }
}
