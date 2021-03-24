package net.virtualinfinity.atrobots.interrupts;

import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.computer.InterruptHandler;
import net.virtualinfinity.atrobots.computer.MemoryCell;

/**
 * @author Daniel Pitts
 */
public class GetGameInfoInterrupt extends InterruptHandler {
    private final MemoryCell activeRobots;
    private final MemoryCell currentRound;
    private final MemoryCell totalRounds;
    private final short totalRoundsValue;
    private final short roundNumberValue;
    private final Arena arena;

    public GetGameInfoInterrupt(NewClazz009212036166466318GetGameInfoInterrupt parameterObject) {
        this.activeRobots = parameterObject.getActiveRobots();
        this.currentRound = parameterObject.getCurrentRound();
        this.totalRounds = parameterObject.getTotalRounds();
        this.totalRoundsValue = (short) parameterObject.getTotalRoundsValue();
        this.roundNumberValue = (short) parameterObject.getRoundNumber();
        this.arena = parameterObject.getArena();
    }

    public void handleInterrupt() {
        activeRobots.set((short) arena.countActiveRobots());
        currentRound.set(roundNumberValue);
        totalRounds.set(totalRoundsValue);
    }
}
