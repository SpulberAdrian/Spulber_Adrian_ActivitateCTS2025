public class SingletonLazy {
    private static SingletonLazy instanta = null;
    private int tipAlocat;
    private int gradeGatire;

    private SingletonLazy(int tipAlocat, int gradeGatire) {
        this.tipAlocat = tipAlocat;
        this.gradeGatire = gradeGatire;
    }

    public static SingletonLazy getInstanta( int tipAlocat,  int gradeGatire){
        if(instanta == null) {
            instanta = new SingletonLazy(tipAlocat, gradeGatire);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingletonLazy{");
        sb.append("tipAlocat=").append(tipAlocat);
        sb.append(", gradeGatire=").append(gradeGatire);
        sb.append('}');
        return sb.toString();
    }
}
