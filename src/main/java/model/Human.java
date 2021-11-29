/*
 *    Rizat.Orazalina created on 26.11.2021
 */

package model;

import interfaces.Action;

public class Human  implements Action {
    private static final int DISTANCE = 1000;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxDistance() {
        return DISTANCE;
    }

    public void jump() {
        System.out.println(getName() + " Человек перепрыгнул");
    }

    public void run() {
        System.out.println(getName() + " Человек пробежал");
    }
}
