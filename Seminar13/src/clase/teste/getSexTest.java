package clase.teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class getSexTest {

    @Test
    public void getSexRight() {
        Persoana persoana = new Persoana("Gigi","5030717392423");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexRight2() {
        Persoana persoana = new Persoana("Gigi","6030717392423");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexBoundary(){
        Persoana persoana = new Persoana("Gigi","8030717392423");
        assertEquals("F",persoana.getSex());
    }
}