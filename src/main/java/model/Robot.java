/*
 *    Rizat.Orazalina created on 26.11.2021
 */

package model;

import interfaces.Action;

public class Robot  implements Action {
    private static final int DISTANCE = 500;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return DISTANCE;
    }

    public void jump() {
        System.out.println(getName() + " Робот перепрыгнул");
    }

    public void run() {
        System.out.println(getName() + " Робот пробежал");
    }
}
