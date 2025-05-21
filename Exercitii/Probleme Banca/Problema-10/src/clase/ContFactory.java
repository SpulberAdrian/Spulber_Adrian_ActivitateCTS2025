package clase;

import java.util.HashMap;
import java.util.Map;

public class ContFactory {

    Map<String,InformatiiCont> informatii = new HashMap<>();

    public InformatiiCont getCont(String nume, String adresa, String telefon, String email){
        String key = nume+adresa+telefon+email;
        if(!informatii.containsKey(key)){
            informatii.put(key,new InformatiiCont(nume,adresa,telefon,email));
        }
        return informatii.get(key);
    }

}
