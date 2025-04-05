public abstract class AMedicament {
        protected String denumire;
        protected int cantitateSubstantaActiva;
        protected int cantitateSubstantaSecundara;
        protected String adaugari;

        public abstract void descriere();
        public abstract AMedicament clone();

    public AMedicament(String denumire, int cantitateSubstantaActiva, int cantitateSubstantaSecundara, String adaugari) {
        this.denumire = denumire;
        this.cantitateSubstantaActiva = cantitateSubstantaActiva;
        this.cantitateSubstantaSecundara = cantitateSubstantaSecundara;
        this.adaugari = adaugari;
    }

    public AMedicament(){
        this.denumire =  "-";
        this.cantitateSubstantaActiva = 0;
        this.cantitateSubstantaSecundara = 0;
        this.adaugari = "-";
    }
}
