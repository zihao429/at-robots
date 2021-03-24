package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.robot.Robot;

public class NewClazz0036385873164493443AtRobotInterruptFactory {
	private Robot robot;
	private Arena arena;
	private RoundState roundState;

	public NewClazz0036385873164493443AtRobotInterruptFactory(Robot robot, Arena arena, RoundState roundState) {
		this.robot = robot;
		this.arena = arena;
		this.roundState = roundState;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

	public RoundState getRoundState() {
		return roundState;
	}

	public void setRoundState(RoundState roundState) {
		this.roundState = roundState;
	}
}