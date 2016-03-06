package hu.nik.project.environment.objects;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Róbert on 2016.02.27..
 *
 * Test class for SceneObject
 */
public class SceneObjectWithConcreteClassTest {

    private static SceneObject sceneObject;

    @BeforeClass
    public static void setUp() throws Exception {
        sceneObject = new Parking(50, 40, 20, Parking.ParkingType.PARKING_90);
    }

    @Test
    public void testGetObjectType() throws Exception {
        Assert.assertEquals(Parking.ParkingType.PARKING_90, sceneObject.getObjectType());
    }

    @Test
    public void testGetPositionX() throws Exception {
        Assert.assertNotEquals(90, sceneObject.getPositionX());
        Assert.assertEquals(50, sceneObject.getPositionX());
    }

    @Test
    public void testGetPositionY() throws Exception {
        Assert.assertNotEquals(90, sceneObject.getPositionY());
        Assert.assertEquals(40, sceneObject.getPositionY());
    }

    @Test
    public void testGetRotation() throws Exception {
        Assert.assertNotEquals(90, sceneObject.getRotation());
        Assert.assertEquals(20, sceneObject.getRotation(), 0.00001);
    }

    @Test(expected = SceneObjectException.class)
    public void testExeptionThrowWithRotation() throws SceneObjectException {
        sceneObject = new Parking(999,999, -500, Parking.ParkingType.PARKING_BOLLARD);
    }

    @Test
    public void testConcreteType() {
        Assert.assertEquals(Parking.class, sceneObject.getClass());
    }
}