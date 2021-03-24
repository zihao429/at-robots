package net.virtualinfinity.atrobots.interrupts;

import net.virtualinfinity.atrobots.arena.RoundTimer;
import net.virtualinfinity.atrobots.computer.MemoryCell;

public class NewClazz007393049340774939GetTimerInterrupt {
	private MemoryCell lowCell;
	private MemoryCell highCell;
	private RoundTimer roundTimer;

	public NewClazz007393049340774939GetTimerInterrupt(MemoryCell lowCell, MemoryCell highCell, RoundTimer roundTimer) {
		this.lowCell = lowCell;
		this.highCell = highCell;
		this.roundTimer = roundTimer;
	}

	public MemoryCell getLowCell() {
		return lowCell;
	}

	public void setLowCell(MemoryCell lowCell) {
		this.lowCell = lowCell;
	}

	public MemoryCell getHighCell() {
		return highCell;
	}

	public void setHighCell(MemoryCell highCell) {
		this.highCell = highCell;
	}

	public RoundTimer getRoundTimer() {
		return roundTimer;
	}

	public void setRoundTimer(RoundTimer roundTimer) {
		this.roundTimer = roundTimer;
	}
}