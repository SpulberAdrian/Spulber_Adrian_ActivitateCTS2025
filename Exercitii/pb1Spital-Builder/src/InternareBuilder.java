public class InternareBuilder implements IBuilder {

    private Boolean patRabatabil;
    private Boolean micDejun;
    private Boolean papuciDeCamera;
    private Boolean halat;

    public InternareBuilder patRabatabil(Boolean patRabatabil){
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilder micDejun(Boolean micDejun){
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilder papuciDeCamera(Boolean papuciDeCamera){
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public InternareBuilder halat(Boolean halat){
        this.halat = halat;
        return this;
    }
    public Internare buildInternare(){
        return new Internare(patRabatabil,micDejun,papuciDeCamera,halat);
    }
}
