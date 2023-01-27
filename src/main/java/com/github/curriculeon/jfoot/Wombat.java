package com.github.curriculeon.jfoot;

import com.github.git_leon.RandomUtils;

import static com.github.curriculeon.jfoot.Direction.*;


/**
 * Wombat. A Wombat moves forward until it hits the edge of the world, at
 * which point it turns left. If a wombat finds a leaf, it eats it.
 *
 * @author Michael Kölling
 * @version 2.0
 */
public class Wombat extends Herbivore {
    public Wombat() {
        setImage("wombat.png");
    }




    public void turnLeft() {
        if (super.getDirection() == EAST) {
            super.setDirection(NORTH);
        } else if (super.getDirection() == WEST) {
            super.setDirection(SOUTH);
        } else if (super.getDirection() == NORTH) {
            super.setDirection(WEST);
        } else {
            super.setDirection(EAST);
        }
    }



    public void act() {
        if (super.foundLeaf()) {
            super.eatLeaf();
        } else if (super.canMove()) {
            super.move();
        } else {
            turnLeft();
        }
    }
}
