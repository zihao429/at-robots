package net.virtualinfinity.atrobots.measures;

public class NewClazz00615813240367618Vector {
	private Vector linePoint;
	private AbsoluteAngle lineSlope;
	private double segmentLength;

	public NewClazz00615813240367618Vector(Vector linePoint, AbsoluteAngle lineSlope, double segmentLength) {
		this.linePoint = linePoint;
		this.lineSlope = lineSlope;
		this.segmentLength = segmentLength;
	}

	public Vector getLinePoint() {
		return linePoint;
	}

	public void setLinePoint(Vector linePoint) {
		this.linePoint = linePoint;
	}

	public AbsoluteAngle getLineSlope() {
		return lineSlope;
	}

	public void setLineSlope(AbsoluteAngle lineSlope) {
		this.lineSlope = lineSlope;
	}

	public double getSegmentLength() {
		return segmentLength;
	}

	public void setSegmentLength(double segmentLength) {
		this.segmentLength = segmentLength;
	}
}