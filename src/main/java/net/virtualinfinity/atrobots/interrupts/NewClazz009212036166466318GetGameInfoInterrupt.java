package net.virtualinfinity.atrobots.interrupts;

import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.computer.MemoryCell;

public class NewClazz009212036166466318GetGameInfoInterrupt {
	private MemoryCell activeRobots;
	private MemoryCell currentRound;
	private MemoryCell totalRounds;
	private int totalRoundsValue;
	private int roundNumber;
	private Arena arena;

	public NewClazz009212036166466318GetGameInfoInterrupt(MemoryCell activeRobots, MemoryCell currentRound,
			MemoryCell totalRounds, int totalRoundsValue, int roundNumber, Arena arena) {
		this.activeRobots = activeRobots;
		this.currentRound = currentRound;
		this.totalRounds = totalRounds;
		this.totalRoundsValue = totalRoundsValue;
		this.roundNumber = roundNumber;
		this.arena = arena;
	}

	public MemoryCell getActiveRobots() {
		return activeRobots;
	}

	public void setActiveRobots(MemoryCell activeRobots) {
		this.activeRobots = activeRobots;
	}

	public MemoryCell getCurrentRound() {
		return currentRound;
	}

	public void setCurrentRound(MemoryCell currentRound) {
		this.currentRound = currentRound;
	}

	public MemoryCell getTotalRounds() {
		return totalRounds;
	}

	public void setTotalRounds(MemoryCell totalRounds) {
		this.totalRounds = totalRounds;
	}

	public int getTotalRoundsValue() {
		return totalRoundsValue;
	}

	public void setTotalRoundsValue(int totalRoundsValue) {
		this.totalRoundsValue = totalRoundsValue;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}
}