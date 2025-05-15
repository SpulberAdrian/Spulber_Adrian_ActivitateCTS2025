package clase;

public class Tramvai extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 10){
            System.out.println("O sa calatoriti cu Tramvaiul");
        }
        else if(next != null){
            next.recomanda(distanta);
        }else{
            System.out.println("Ne pare rau");
        }
    }
}
