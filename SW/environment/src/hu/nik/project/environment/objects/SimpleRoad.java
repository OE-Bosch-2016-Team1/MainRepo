package hu.nik.project.environment.objects;

import hu.nik.project.environment.ScenePoint;

/**
 * Created by Róbert on 2016.02.27..
 *
 * Class for Roads
 */
public class SimpleRoad extends Road {

    public enum SimpleRoadType  {
        SIMPLE_45_LEFT,
        SIMPLE_45_RIGHT,
        SIMPLE_65_LEFT,
        SIMPLE_65_RIGHT,
        SIMPLE_90_LEFT,
        SIMPLE_90_RIGHT,
        SIMPLE_STRAIGHT
    }

    private SimpleRoadType type;

    public SimpleRoad(ScenePoint basePosition, int rotation, SimpleRoadType type) throws SceneObjectException {
        super(basePosition, rotation);
        this.type = type;
    }

    public SimpleRoadType getObjectType() {
        return type;
    }

    public String toString() {
        return super.toString() + " SimpleRoadType: " + type.toString();
    }
}
