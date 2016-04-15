package hu.nik.project.lka;

/**
 * Created by zhodvogner on 2016. ápr. 15..
 */
public class LkaPacket {

    private int requestedSteeringWheelAngle = 0;
    private int maximumSpeedForKeepingLane = 50;

    public LkaPacket(int requestedSteeringWheelAngle, int maximumSpeedForKeepingLane) {
        this.requestedSteeringWheelAngle = requestedSteeringWheelAngle;
        this.maximumSpeedForKeepingLane = maximumSpeedForKeepingLane;
    }

    public int getRequestedSteeringWheelAngle() {
        return requestedSteeringWheelAngle;
    }

    public int getMaximumSpeedForKeepingLane() {
        return maximumSpeedForKeepingLane;
    }

}
