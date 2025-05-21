package clase;

public class Client {
    private StrategieVerificare strategie;

    public void setStrategie(StrategieVerificare strategie) {
        this.strategie = strategie;
    }

    public void efectuareVerificare(){
        strategie.verificareDocumente();
    }
}
