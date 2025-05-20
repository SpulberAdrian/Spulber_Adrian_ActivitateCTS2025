package clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(int nrPersoane) {
        if(nrPersoane > 4){
            rezervare.realizeazaRezervare(nrPersoane);
        }
        else{
            System.out.println("Numarul minim de persoane pentru rezevare este de 4");
        }
    }
}
