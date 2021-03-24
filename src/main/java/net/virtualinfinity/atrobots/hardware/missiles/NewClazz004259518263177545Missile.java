package net.virtualinfinity.atrobots.hardware.missiles;

import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;

public class NewClazz004259518263177545Missile {
	private DamageInflicter damageInflicter;
	private Position position;
	private AbsoluteAngle angle;
	private double power;
	private boolean overburn;

	public NewClazz004259518263177545Missile(DamageInflicter damageInflicter, Position position, AbsoluteAngle angle,
			double power, boolean overburn) {
		this.damageInflicter = damageInflicter;
		this.position = position;
		this.angle = angle;
		this.power = power;
		this.overburn = overburn;
	}

	public DamageInflicter getDamageInflicter() {
		return damageInflicter;
	}

	public void setDamageInflicter(DamageInflicter damageInflicter) {
		this.damageInflicter = damageInflicter;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public AbsoluteAngle getAngle() {
		return angle;
	}

	public void setAngle(AbsoluteAngle angle) {
		this.angle = angle;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public boolean isOverburn() {
		return overburn;
	}

	public void setOverburn(boolean overburn) {
		this.overburn = overburn;
	}
}