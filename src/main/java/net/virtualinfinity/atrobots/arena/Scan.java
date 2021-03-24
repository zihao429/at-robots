package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.measures.AngleBracket;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.measures.Vector;
import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;
import net.virtualinfinity.atrobots.snapshots.ScanSnapshot;

/**
 * @author Daniel Pitts
 */
public class Scan extends ArenaObject {
    private final AngleBracket angleBracket;
    private final double maxDistance;
    private final boolean successful;
    private final Vector matchPositionVector;
    private final boolean accuracyAvailable;
    private final int accuracy;
    private int frame;

    public Scan(NewClazz007461909774589633Scan parameterObject) {
        this.accuracyAvailable = parameterObject.isAccuracyAvailable();
        this.accuracy = parameterObject.getAccuracy();
        this.angleBracket = parameterObject.getAngleBracket();
        this.maxDistance = parameterObject.getMaxDistance();
        this.successful = parameterObject.isSuccessful();
        this.matchPositionVector = parameterObject.getMatchPositionVector();
    }

    protected ArenaObjectSnapshot createSpecificSnapshot() {
        ScanSnapshot objectSnapshot = new ScanSnapshot(angleBracket, maxDistance, successful, matchPositionVector, accuracyAvailable, accuracy);
        objectSnapshot.setPositionVector(position.getVector());
        return objectSnapshot;
    }


    public void update(Duration duration) {
        if (frame++ > 1) {
            die();
        }
    }

    public void accept(ArenaObjectVisitor arenaObjectVisitor) {
        arenaObjectVisitor.visit(this);
    }
}
