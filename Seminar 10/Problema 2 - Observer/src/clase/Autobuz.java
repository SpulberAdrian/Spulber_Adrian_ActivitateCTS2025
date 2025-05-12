package clase;

public class Autobuz extends MijlocTransport {


    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    public void pleacaDeLaCapat(){
        trimiteMesaj("Autobuzul"+this.numarLinie+"a plecat din statie");
    }
    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul"+this.numarLinie+"si-a schimbat traseul");
    }

}
