package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.arena.RoundTimer;
import net.virtualinfinity.atrobots.atsetup.AtRobotInterrupt;
import net.virtualinfinity.atrobots.computer.InterruptHandler;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.computer.Registers;
import net.virtualinfinity.atrobots.interrupts.*;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.util.MapWithDefaultValue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static net.virtualinfinity.atrobots.atsetup.AtRobotInterrupt.*;

/**
 * Creates built-in interrupt handlers for the standard AT-Robots set up.
 *
 * @author Daniel Pitts
 */
public class AtRobotInterruptFactory {

    private InterruptHandler createResetMetersInterrupt(Robot robot) {
        return new ResetMetersInterrupt(getRegisters(robot).getMeters(), robot.getOdometer());
    }

    private InterruptHandler createGetRobotStatisticsInterrupt(Robot robot) {
        return robot.createGetRobotStatisticsInterrupt(getDxCell(robot), getExCell(robot), getFxCell(robot));
    }

    private MemoryCell getDxCell(Robot robot) {
        return getRegisters(robot).getDx();
    }

    private InterruptHandler createResetQueueInterrupt(Robot robot) {
        return new ZeroMemoryCellsInterrupt(getRegisters(robot).getCommunicationQueueHead(),
                getRegisters(robot).getCommunicationQueueTail());
    }

    private InterruptHandler createGetQueueSizeInterrupt(Robot robot) {
        return new GetQueueSizeInterrupt(robot.getComputer().getCommQueue(), getFxCell(robot));
    }

    private InterruptHandler createRecieveInterrupt(Robot robot) {
        return new ReceiveInterrupt(robot.getComputer().getCommQueue(), getFxCell(robot));
    }

    private InterruptHandler createTransmitInterrupt(Robot robot) {
        return new TransmitInterrupt(robot.getTransceiver(), getAxCell(robot));
    }

    private InterruptHandler createResetCollisionCountInterrupt(Robot robot) {
        return new ZeroMemoryCellsInterrupt(getRegisters(robot).getCollisionCount());
    }

    private InterruptHandler createGetCollisionsInterrupt(Robot robot) {
        return new CopyMemoryCellsInterrupt(getRegisters(robot).getCollisionCount(), getFxCell(robot));
    }

    private InterruptHandler createGetRobotInfoInterrupt(Robot robot) {
        return robot.createGetRobotInfoInterruptHandler(getDxCell(robot), getExCell(robot), getFxCell(robot));
    }

    private InterruptHandler createGetGameInfoInterrupt(NewClazz0036385873164493443AtRobotInterruptFactory parameterObject) {
        return new GetGameInfoInterrupt(getDxCell(parameterObject.getRobot()), getExCell(parameterObject.getRobot()), getFxCell(parameterObject.getRobot()), parameterObject.getRoundState().getTotalRounds(), parameterObject.getRoundState().getRoundNumber(), parameterObject.getArena());
    }

    private InterruptHandler createGetTargetInfoInterrupt(Robot robot) {
        return new CopyMemoryCellsInterrupt(getRegisters(robot).getTargetHeading(), getExCell(robot),
                getRegisters(robot).getTargetThrottle(), getFxCell(robot));
    }

    private InterruptHandler createGetTargetIdInterrupt(Robot robot) {
        return new CopyMemoryCellsInterrupt(getRegisters(robot).getTargetId(), getFxCell(robot));
    }

    private InterruptHandler createFindAngleInterrupt(Robot robot) {
        return new FindAngleInterrupt(getExCell(robot), getFxCell(robot), getAxCell(robot), robot);
    }

    private MemoryCell getAxCell(Robot robot) {
        return getRegisters(robot).getAx();
    }

    private InterruptHandler createGetTimerInterrupt(Robot robot, RoundTimer roundTimer) {
        return new GetTimerInterrupt(getExCell(robot), getFxCell(robot), roundTimer);
    }

    private InterruptHandler createGetTransponderIdInterrupt(Robot robot) {
        return new GetIdInterrupt(robot.getTransponder(), getFxCell(robot));
    }

    private InterruptHandler createOverburnInterrupt(Robot robot) {
        return new OverburnInterrupt(robot, getAxCell(robot));
    }

    private InterruptHandler createSetKeepshiftInterrupt(Robot robot) {
        return new SetKeepshiftInterrupt(robot.getTurret(), getAxCell(robot));
    }

    private InterruptHandler createLocateInterrupt(Robot robot) {
        return new LocateInterrupt(robot,
                getExCell(robot), getFxCell(robot));
    }

    private MemoryCell getFxCell(Robot robot) {
        return getRegisters(robot).getFx();
    }

    private MemoryCell getExCell(Robot robot) {
        return getRegisters(robot).getEx();
    }

    private Registers getRegisters(Robot robot) {
        return robot.getComputer().getRegisters();
    }

    private InterruptHandler createResetInterrupt(Robot robot) {
        return new ResetInterrupt(robot.getComputer());
    }

    private InterruptHandler createDestructInterrupt(Destructable destructable) {
        return new DestructInterrupt(destructable);
    }

    InvalidInterrupt createInvalidInterrupt(Robot robot) {
        return new InvalidInterrupt(robot.getComputer());
    }

    public Map<Integer, InterruptHandler> createInterruptTable(NewClazz0001642203775029305AtRobotInterruptFactory parameterObject) {
        Map<Integer, InterruptHandler> interrupts = new HashMap<Integer, InterruptHandler>();

        mapHandler(interrupts, DESTRUCT, createDestructInterrupt(parameterObject.getRobot()));
        mapHandler(interrupts, RESET, createResetInterrupt(parameterObject.getRobot()).costs(10));
        mapHandler(interrupts, LOCATE, createLocateInterrupt(parameterObject.getRobot()).costs(5));
        mapHandler(interrupts, KEEPSHIFT, createSetKeepshiftInterrupt(parameterObject.getRobot()).costs(2));
        mapHandler(interrupts, OVERBURN, createOverburnInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, ID, createGetTransponderIdInterrupt(parameterObject.getRobot()).costs(2));
        mapHandler(interrupts, TIMER, createGetTimerInterrupt(parameterObject.getRobot(), parameterObject.getArena().getRoundTimer()).costs(2));
        mapHandler(interrupts, ANGLE, createFindAngleInterrupt(parameterObject.getRobot()).costs(32));
        mapHandler(interrupts, TARGETID, createGetTargetIdInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, TARGETINFO, createGetTargetInfoInterrupt(parameterObject.getRobot()).costs(2));
        mapHandler(interrupts, GAMEINFO, createGetGameInfoInterrupt(new NewClazz0036385873164493443AtRobotInterruptFactory(parameterObject.getRobot(), parameterObject.getArena(), parameterObject.getRoundState())).costs(4));
        mapHandler(interrupts, ROBOTINFO, createGetRobotInfoInterrupt(parameterObject.getRobot()).costs(5));
        mapHandler(interrupts, COLLISIONS, createGetCollisionsInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, RESETCOLCNT, createResetCollisionCountInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, TRANSMIT, createTransmitInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, RECEIVE, createRecieveInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, DATAREADY, createGetQueueSizeInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, CLEARCOM, createResetQueueInterrupt(parameterObject.getRobot()).costs(1));
        mapHandler(interrupts, KILLS, createGetRobotStatisticsInterrupt(parameterObject.getRobot()).costs(3));
        mapHandler(interrupts, CLEARMETERS, createResetMetersInterrupt(parameterObject.getRobot()).costs(1));
        connectHandlers(parameterObject.getRobot(), interrupts.values());
        return new MapWithDefaultValue<Integer, InterruptHandler>(interrupts, createInvalidInterrupt(parameterObject.getRobot()));
    }

    private void mapHandler(Map<Integer, InterruptHandler> interrupts, AtRobotInterrupt interrupt, InterruptHandler handler) {
        interrupts.put(interrupt.interruptNumber, handler);
    }

    private void connectHandlers(Robot robot, Collection<InterruptHandler> interruptHandlers) {
        for (InterruptHandler handler : interruptHandlers) {
            handler.setCycleSource(robot.getComputer());
        }
    }
}
