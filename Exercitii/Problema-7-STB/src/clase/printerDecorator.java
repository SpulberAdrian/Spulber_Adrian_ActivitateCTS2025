package clase;

public abstract class printerDecorator implements Printeaza {
    protected Printeaza printer;

    public printerDecorator(Printeaza printer) {
        this.printer = printer;
    }

    public void printeazaBilet(){
        printer.printeazaBilet();
    }
}
