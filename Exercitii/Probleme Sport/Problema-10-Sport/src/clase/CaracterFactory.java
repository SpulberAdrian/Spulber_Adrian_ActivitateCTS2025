package clase;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {
    private Map<String,InformatiiCaracter> colectie = new HashMap<>();

    public InformatiiCaracter getCaracter(int inaltime, int latime, String culoare, int pozitie){
        String key = inaltime+latime+culoare+pozitie;
        if(!colectie.containsKey(key)){
            colectie.put(key,new InformatiiCaracter(inaltime,latime,culoare,pozitie));
        }
        return colectie.get(key);
    }
}
