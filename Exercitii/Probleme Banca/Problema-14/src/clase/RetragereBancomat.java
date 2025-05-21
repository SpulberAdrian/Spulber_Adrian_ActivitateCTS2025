package clase;

public class RetragereBancomat extends RetragereBani{
    @Override
    public void introduceCard() {
        System.out.println("Se introduce cardul");
    }

    @Override
    public void introducerePIN() {
        System.out.println("Introducere PIN");
    }

    @Override
    public void specificareSuma() {
        System.out.println("Specifica suma");
    }

    @Override
    public void retragereBani() {
        System.out.println("retragere bani");
    }

    @Override
    public void retragereCard() {
        System.out.println("retragere card");
    }
}
