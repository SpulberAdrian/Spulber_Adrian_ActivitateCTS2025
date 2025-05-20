package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler curatareMasa = new CuratareMasa();
        Handler asezareTacamuri = new AsezareTacamuri();
        Handler asezareServetele = new AsezareServetele();
        Handler invitatrePersoane = new InvitarePersoane();

        curatareMasa.setNext(asezareTacamuri);
        asezareTacamuri.setNext(asezareServetele);
        asezareServetele.setNext(invitatrePersoane);

        curatareMasa.ocupaMasa();
    }
}
