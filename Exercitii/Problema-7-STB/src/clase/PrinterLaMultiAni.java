package clase;

public class PrinterLaMultiAni extends printerDecorator {

    public PrinterLaMultiAni(Printeaza printer) {
        super(printer);
    }
    public void printeazaBilet(){
        super.printeazaBilet();
        System.out.println("La multi ani,Romania!");
    }
}
