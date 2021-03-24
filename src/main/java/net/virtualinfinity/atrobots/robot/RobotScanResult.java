package net.virtualinfinity.atrobots.robot;

import net.virtualinfinity.atrobots.hardware.scanning.ScanResult;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Vector;

/**
 * @author Daniel Pitts
 */
public class RobotScanResult implements ScanResult {
    private final Robot match;
    private final double distance;
    private final AbsoluteAngle angle;
    private final AbsoluteAngle heading;
    private final int throttle;
    private final int accuracy;

    public RobotScanResult(NewClazz0048066509496196286RobotScanResult parameterObject) {
        this.match = parameterObject.getMatch();
        this.distance = parameterObject.getDistance();
        this.angle = parameterObject.getAngle();
        this.accuracy = parameterObject.getAccuracy();
        heading = parameterObject.getMatch().getHeading().getAngle();
        throttle = parameterObject.getMatch().getThrottle().getDesiredPower();
    }

    public RobotScanResult() {
        distance = Double.POSITIVE_INFINITY;
        match = null;
        angle = null;
        heading = null;
        throttle = 0;
        accuracy = 0;
    }


    public Robot getMatch() {
        return match;
    }

    public double getDistance() {
        return distance;
    }

    public AbsoluteAngle getAngle() {
        return angle;
    }

    public AbsoluteAngle getHeading() {
        return heading;
    }

    public int getThrottle() {
        return throttle;
    }

    public boolean successful() {
        return match != null;
    }

    public int getAccuracy() {
        return accuracy;
    }

    Vector getMatchPositionVector() {
        return successful() ? getMatch().getPosition().getVector() : null;
    }
}