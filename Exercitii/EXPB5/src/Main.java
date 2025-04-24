public class Main {
    public static void main(String[] args) {
        SingletonLazy cuptor = SingletonLazy.getInstanta(20,400);
        System.out.println(cuptor.toString());

        SingletonEarly cuptor2 = SingletonEarly.getInstanta();
        System.out.println(cuptor2.toString());

        CuptorSingletonRegistry registru = CuptorSingletonRegistry.getInstanta();
        registru.adaugaCuptor(new Cuptor("Cuptor1",20,300));
        registru.adaugaCuptor(new Cuptor("Cuptor2",20,300));
        registru.adaugaCuptor(new Cuptor("Cuptor3",20,300));
        registru.adaugaCuptor(new Cuptor("Cuptor4",20,300));

        registru.afiseaza();

    }
}
