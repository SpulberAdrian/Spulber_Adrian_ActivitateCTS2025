public class Main {
    public static void main(String[] args) {
        IBuilder builder = new InternareBuilder();
        builder.patRabatabil(true).micDejun(true).halat(true).papuciDeCamera(false);
        Internare internare = builder.buildInternare();
        System.out.println(internare);

    }
}
