package com.java.designpattern.pattern7_state;

public class AirController {

    public static final OpenState STATE_OPEN = new OpenState();
    public static final ClosedState STATE_CLOSED = new ClosedState();

    private AirState currentState = STATE_CLOSED;

    public AirController() {
        this.currentState.setController(this);
    }

    public AirState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AirState currentState) {
        this.currentState = currentState;
        currentState.setController(this);
    }

    public void powerOn() {
        currentState.powerOn();
    }

    public void powerOff() {
        currentState.powerOff();
    }

    public void adjustTemp() {
        currentState.adjustTemp();
    }
}