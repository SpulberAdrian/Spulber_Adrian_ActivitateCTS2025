public class Cuptor {

    private String id;
    private int timpCoacere;
    private int grade;

    public Cuptor(String id, int timpCoacere, int grade) {
        this.id = id;
        this.timpCoacere = timpCoacere;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("id='").append(id).append('\'');
        sb.append(", timpCoacere=").append(timpCoacere);
        sb.append(", grade=").append(grade);
        sb.append('}');
        return sb.toString();
    }
}
