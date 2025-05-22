package clase;

public class ProxyCumparator implements ICumparator {
    private ICumparator cumparator;

    public ProxyCumparator(ICumparator cumparator) {
        this.cumparator = cumparator;
    }

    @Override
    public void vanzare(int varsta) {
        if(varsta > 14){
            cumparator.vanzare(varsta);
        }else {
            System.out.println("Ne pare rau, varsta minima este de 14 ani");
        }
    }
}
