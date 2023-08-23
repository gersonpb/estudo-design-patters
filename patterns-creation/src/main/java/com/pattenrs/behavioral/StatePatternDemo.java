package com.pattenrs.behavioral;

import com.pattenrs.behavioral.state.Context;
import com.pattenrs.behavioral.state.StartState;
import com.pattenrs.behavioral.state.StopState;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
