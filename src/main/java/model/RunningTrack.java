/*
 *    Rizat.Orazalina created on 26.11.2021
 */

package model;

import interfaces.*;

public class RunningTrack implements Barriers {
    private int length;
    private boolean doAction = true;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getDistance() {
        return length;
    }

    public boolean isDoAction() {
        return doAction;
    }

    public void setDoAction(boolean doAction) {
        this.doAction = doAction;
    }

    public void runOnRunningTrack(Runable runable){
        if (doAction) {
            runable.run();
            setDoAction(true);
        } else {
            System.out.println(" Участник не смог пробежать!");
        }
    }

    public void doAction(Action action) {

        if (doAction) {
            action.run();
            setDoAction(false);
        } else {
            System.out.println(action.getName() + " Участник не смог пробежать!");
        }
    }
}
