package hu.nik.project.lka;

import hu.nik.project.communication.*;
import hu.nik.project.environment.objects.AdvancedRoad;
import hu.nik.project.environment.objects.CurvedRoad;
import hu.nik.project.environment.objects.SimpleRoad;

/**
 * Created by zhodvogner on 2016. ápr. 14.
 *
 * LKA - Lane Keeping Assistance module
 *
 * Developer: Máté, Újszászi (Team1)
 *
 */
public class Lka implements ICommBusDevice {

    private CommBusConnector commBusConnector;
    private String lastErrorMessage;

    public Lka(CommBus commBus, CommBusConnectorType commBusConnectorType) {
        commBusConnector = commBus.createConnector(this, commBusConnectorType);
    }

    @Override
    public void commBusDataArrived() {

        Class dataType = commBusConnector.getDataType();

        if (dataType == SimpleRoad.class){
            try {

                // read data from the bus
                SimpleRoad data = (SimpleRoad)commBusConnector.receive();

                // TODO: processing input messages and calculate output values
                int requestedSteeringWheelAngle = 0;
                int maximumSpeedForKeepingLane = 50;

                // send response message onto the bus (if necessary)
                commBusConnector.send(new LkaPacket(requestedSteeringWheelAngle, maximumSpeedForKeepingLane));

            } catch (CommBusException e) {
                lastErrorMessage = e.getMessage();
            }
        }

        // TODO: must detect both of other road-types too: AdvancedRoad.class and CurvedRoad.class

        // TODO: might detect speed and must known car-position and car-direction
    }
}
