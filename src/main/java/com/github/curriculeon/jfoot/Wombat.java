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
        if (getDirection() == EAST) {
            setDirection(NORTH);
        } else if (getDirection() == WEST) {
            setDirection(SOUTH);
        } else if (getDirection() == NORTH) {
            setDirection(WEST);
        } else {
            setDirection(EAST);
        }
    }

    public void turnRight() {
        if (getDirection() == EAST) {
            setDirection(SOUTH);
        } else if(getDirection() == WEST) {
            setDirection(NORTH);
        } else if (getDirection() == NORTH) {
            setDirection(EAST);
        } else  {
            setDirection(WEST);
        }
    }



    public void act() {

        if (foundLeaf()) {
            eatLeaf();
        } else if (canMove()) {
            move();

        } else {
            if (getDirection() == EAST) {
                turnLeft();
                move();
                turnLeft();
            } else if (getDirection() == WEST) {
                turnRight();
                move();
                turnRight();
            }


        }
    }
}
