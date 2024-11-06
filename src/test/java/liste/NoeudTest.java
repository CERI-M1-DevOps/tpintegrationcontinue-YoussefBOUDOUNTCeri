package liste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoeudTest {

    @Test
    void testGetElement() {
        Noeud noeud = new Noeud(5, null);
        assertEquals(5, noeud.getElement());
    }

    @Test
    void testSetElement() {
        Noeud noeud = new Noeud(5, null);
        noeud.setElement(10);
        assertEquals(10, noeud.getElement());
    }

    @Test
    void testGetSuivant() {
        Noeud suivant = new Noeud(10, null);
        Noeud noeud = new Noeud(5, suivant);
        assertEquals(suivant, noeud.getSuivant());
    }

    @Test
    void testSetSuivant() {
        Noeud noeud1 = new Noeud(5, null);
        Noeud noeud2 = new Noeud(10, null);
        noeud1.setSuivant(noeud2);
        assertEquals(noeud2, noeud1.getSuivant());
    }

    @Test
    void testToString() {
        Noeud noeud = new Noeud(5, null);
        assertEquals("Noeud(5)", noeud.toString());
    }
}
