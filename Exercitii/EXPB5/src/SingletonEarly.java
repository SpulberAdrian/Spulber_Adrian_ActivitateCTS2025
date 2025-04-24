public class SingletonEarly {
    private static SingletonEarly instance = new SingletonEarly();
    private int timpGatire;
    private int temperaturaGatire;

    private SingletonEarly() {
        this.timpGatire = 20;
        this.temperaturaGatire = 400;
    }

    public static SingletonEarly getInstanta(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonEarly{");
        sb.append("timpGatire=").append(timpGatire);
        sb.append(", temperaturaGatire=").append(temperaturaGatire);
        sb.append('}');
        return sb.toString();
    }
}
