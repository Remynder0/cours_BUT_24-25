import static org.junit.jupiter.api.Assertions.*;

class IntervalleTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        Intervalle inter1 = new Intervalle();
        Intervalle inter2 = new Intervalle();

        inter1.setMinMax(1, 2);
        inter2.setMinMax(1, 2);

        assertEquals(inter1, inter2);
    }

    @org.junit.jupiter.api.Test
    void testConstructeur() {
        Intervalle inter = new Intervalle();
        assertEquals(inter.getMin(), 0);
        assertEquals(inter.getMax(), 0);
    }

    @org.junit.jupiter.api.Test
    void testSetMinMax () {
        Intervalle inter = new Intervalle();
        inter.setMinMax(1, 2);
        assertEquals(inter.getMin(), 1);
        assertEquals(inter.getMax(), 2);
    }

    @org.junit.jupiter.api.Test
    void testgetLongueur() {
        Intervalle inter = new Intervalle();
        inter.setMinMax(1, 2);
        assertEquals(inter.getLongueur(), 1);
    }

    @org.junit.jupiter.api.Test
    void testestInclusee() {
        Intervalle inter1 = new Intervalle();
        Intervalle inter2 = new Intervalle();
        inter1.setMinMax(1, 2);
        inter2.setMinMax(1, 2);
        assertTrue(inter1.estInclusee(inter2));
    }
}