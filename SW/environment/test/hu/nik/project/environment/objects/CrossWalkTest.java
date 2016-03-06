package hu.nik.project.environment.objects;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Róbert on 2016.02.27..
 *
 * Test class for CrossWalk
 */
public class CrossWalkTest {

    private static CrossWalk crossWalk;

    @BeforeClass
    public static void setUp() throws Exception {
        crossWalk = new CrossWalk(3522,1555, 90, CrossWalk.CrossWalkType.CROSSWALK_5);
    }

    @Test
    public void testGetObjectType() throws Exception {
        Assert.assertEquals(CrossWalk.CrossWalkType.CROSSWALK_5, crossWalk.getObjectType());
    }

    @Test
    public void testPositionsAndRotationGetters() throws Exception{
        Assert.assertEquals(3522, crossWalk.getPositionX());
        Assert.assertEquals(1555, crossWalk.getPositionY());
        Assert.assertEquals(90, crossWalk.getRotation(), 0.00001);
    }
}