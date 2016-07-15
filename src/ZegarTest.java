import junit.framework.Assert;
import junit.framework.TestCase;

public class ZegarTest extends TestCase {

    public void testGetSmallerDegree() throws Exception {
        Zegar zegar = new Zegar();

        int degr = zegar.getSmallerDegree(300);
        Assert.assertEquals(60, degr);

        int degr2 = zegar.getSmallerDegree(60);
        Assert.assertEquals(60, degr2);

    }

    public void testCreate() throws Exception {
        Zegar z  = new Zegar();
        Assert.assertNotNull(z);
    }

    public void testSetHour() throws Exception {
       Zegar zegar = new Zegar();
        zegar.setHour("22:00");
        Assert.assertEquals(22, zegar.getHours());
        Assert.assertEquals(00, zegar.getMinutes());

        zegar.setHour("20:00");
        Assert.assertEquals(20, zegar.getHours());
        Assert.assertEquals(00, zegar.getMinutes());

    }

    public void testCountDegrees() throws Exception {
        Zegar zegar = new Zegar();
        int degrees = zegar.countDegrees(22, 00);
        Assert.assertEquals(300, degrees);

        int degrees2 = zegar.countDegrees(18, 30);
        Assert.assertEquals(0, degrees2);

    }

}