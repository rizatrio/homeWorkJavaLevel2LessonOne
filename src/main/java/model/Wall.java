/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package model;

import interfaces.*;

public class Wall implements Barriers {
    private int height;
    private boolean doAction = true;

    public Wall(int height) {
        this.height = height;
    }

    public int getDistance() {
        return height;
    }

    public boolean isDoAction() {
        return doAction;
    }

    public void setDoAction(boolean doAction) {
        this.doAction = doAction;
    }

    public void jumpOverWall(Jumpable jumpable){
        if (doAction) {
            jumpable.jump();
            setDoAction(true);
        } else {
            System.out.println(" Участник не смог перепрыгнуть!");
        }
    }

    public void doAction(Action action) {
        if (doAction) {
            action.jump();
            setDoAction(false);
        } else {
            System.out.println(action.getName() + " Участник не смог перепрыгнуть!");
        }
    }

}
