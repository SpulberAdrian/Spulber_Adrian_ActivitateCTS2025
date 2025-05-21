package clase;

public abstract class RetragereBani {

    public abstract void introduceCard();
    public abstract void introducerePIN();
    public abstract  void specificareSuma();
    public abstract  void retragereBani();
    public abstract  void retragereCard();

    public final void retrageBani(){
        introduceCard();
        introducerePIN();
        specificareSuma();
        retragereBani();
        retragereCard();
    }

}
