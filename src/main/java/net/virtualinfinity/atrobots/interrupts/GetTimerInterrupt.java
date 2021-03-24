package net.virtualinfinity.atrobots.interrupts;

import net.virtualinfinity.atrobots.arena.RoundTimer;
import net.virtualinfinity.atrobots.computer.InterruptHandler;
import net.virtualinfinity.atrobots.computer.MemoryCell;

/**
 * @author Daniel Pitts
 */
public class GetTimerInterrupt extends InterruptHandler {
    private final MemoryCell lowCell;
    private final MemoryCell highCell;
    private final RoundTimer roundTimer;

    public GetTimerInterrupt(NewClazz007393049340774939GetTimerInterrupt parameterObject) {
        super();
        this.lowCell = parameterObject.getLowCell();
        this.highCell = parameterObject.getHighCell();
        this.roundTimer = parameterObject.getRoundTimer();
    }

    public void handleInterrupt() {
        final int cycles = roundTimer.getTime().getCycles();
        lowCell.set((short) cycles);
        highCell.set((short) (cycles >>> 16));
    }
}
