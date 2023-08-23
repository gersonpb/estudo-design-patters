package com.pattenrs.behavioral;

import com.pattenrs.behavioral.template.Cricket;
import com.pattenrs.behavioral.template.Football;
import com.pattenrs.behavioral.template.Game;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
