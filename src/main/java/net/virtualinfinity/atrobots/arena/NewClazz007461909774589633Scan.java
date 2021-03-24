package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.measures.AngleBracket;
import net.virtualinfinity.atrobots.measures.Vector;

public class NewClazz007461909774589633Scan {
	private AngleBracket angleBracket;
	private double maxDistance;
	private boolean successful;
	private Vector matchPositionVector;
	private boolean accuracyAvailable;
	private int accuracy;

	public NewClazz007461909774589633Scan(AngleBracket angleBracket, double maxDistance, boolean successful,
			Vector matchPositionVector, boolean accuracyAvailable, int accuracy) {
		this.angleBracket = angleBracket;
		this.maxDistance = maxDistance;
		this.successful = successful;
		this.matchPositionVector = matchPositionVector;
		this.accuracyAvailable = accuracyAvailable;
		this.accuracy = accuracy;
	}

	public AngleBracket getAngleBracket() {
		return angleBracket;
	}

	public void setAngleBracket(AngleBracket angleBracket) {
		this.angleBracket = angleBracket;
	}

	public double getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(double maxDistance) {
		this.maxDistance = maxDistance;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public Vector getMatchPositionVector() {
		return matchPositionVector;
	}

	public void setMatchPositionVector(Vector matchPositionVector) {
		this.matchPositionVector = matchPositionVector;
	}

	public boolean isAccuracyAvailable() {
		return accuracyAvailable;
	}

	public void setAccuracyAvailable(boolean accuracyAvailable) {
		this.accuracyAvailable = accuracyAvailable;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
}