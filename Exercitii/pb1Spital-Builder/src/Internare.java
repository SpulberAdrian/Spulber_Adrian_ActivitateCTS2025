public class Internare {
    private Boolean patRabatabil;
    private Boolean micDejun;
    private Boolean papuciDeCamera;
    private Boolean halat;

    public Internare(Boolean patRabatabil, Boolean micDejun, Boolean papuciDeCamera, Boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciDeCamera = papuciDeCamera;
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
