package clase.teste;

import clase.exceptii.ExceptieCNPInexistent;
import clase.exceptii.ExceptieCNPInvalid;
import clase.Persoana;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class getVarstaTest {
    private Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    public void getVarstaRight() {
        this.persoana = new Persoana("Ione","5030717394975");
        assertEquals(21,this.persoana.getVarsta());
    }

    @Test
    public void getVarstaRight2() {
        this.persoana = new Persoana("Ione","1780717394975");
        assertEquals(46,this.persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaErrorCondition1() {
        this.persoana = new Persoana("Ione","178aa17394975");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
        this.persoana = new Persoana("Ione","1780217394975");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public  void getVarstaConformance(){
        this.persoana = new Persoana("Ione","178");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        Persoana persoana = new Persoana("Ione","1990217394975");
        Persoana persoana1 = new Persoana("Ionut","5010217394975");

        assertTrue(persoana1.getVarsta()<persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistence(){
        this.persoana = new Persoana("Gigi",null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        this.persoana = new Persoana("Gigi","5250526394975");
        assertEquals(0,this.persoana.getVarsta());
    }


}