import B.Restaurant2.RezervareOptiuni;
import B.Restaurant2.RezervareOptiuniBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareOptiuniBuilder builder = new RezervareOptiuniBuilder();
        builder
                .setDecorareMasa(true)
                .setAsezareGeam(true)
                .setGenMuzica("Lautareasca");
        RezervareOptiuni rezervareOptiuni = builder.build();
        System.out.println(rezervareOptiuni.toString());
    }
}
