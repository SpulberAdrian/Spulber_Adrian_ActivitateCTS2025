package main;

import clase.MetrouAdapter;
import clase.MetrouValidator;
import clase.ValidatorAutobuz;
import clase.ValidatorTransport;

public class Main {
    public static void main(String[] args) {
        ValidatorTransport validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        MetrouValidator metrouValidator = new MetrouValidator();
        ValidatorTransport validatorMetrouAdaptat = new MetrouAdapter(metrouValidator);

        validatorMetrouAdaptat.valideazaBilet();
        validatorMetrouAdaptat.valideazaAbonament();
    }
}
