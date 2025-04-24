import java.util.HashMap;
import java.util.Map;

public class CuptorSingletonRegistry {
    private static CuptorSingletonRegistry  instanta = null;
    private Map<String,Cuptor> cuptoare;

    private CuptorSingletonRegistry() {
        this.cuptoare = new HashMap<>();
    }

    public static CuptorSingletonRegistry getInstanta(){
        if(instanta == null){
            instanta = new CuptorSingletonRegistry();
        }
        return instanta;
    }

    public void adaugaCuptor(Cuptor cuptor){
        cuptoare.put(cuptor.getId(),cuptor);
    }

    public  void afiseaza(){
        for (Cuptor c : cuptoare.values()){
            System.out.println(c);
        }
    }
}
