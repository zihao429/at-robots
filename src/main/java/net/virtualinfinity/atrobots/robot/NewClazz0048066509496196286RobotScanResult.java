package net.virtualinfinity.atrobots.robot;

import net.virtualinfinity.atrobots.measures.AbsoluteAngle;

public class NewClazz0048066509496196286RobotScanResult {
	private Robot match;
	private double distance;
	private AbsoluteAngle angle;
	private int accuracy;

	public NewClazz0048066509496196286RobotScanResult(Robot match, double distance, AbsoluteAngle angle, int accuracy) {
		this.match = match;
		this.distance = distance;
		this.angle = angle;
		this.accuracy = accuracy;
	}

	public Robot getMatch() {
		return match;
	}

	public void setMatch(Robot match) {
		this.match = match;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public AbsoluteAngle getAngle() {
		return angle;
	}

	public void setAngle(AbsoluteAngle angle) {
		this.angle = angle;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
}