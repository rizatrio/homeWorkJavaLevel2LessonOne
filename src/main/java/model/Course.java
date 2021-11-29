/*
 *    Rizat.Orazalina created on 24.11.2021
 */

package model;

import interfaces.Action;
import interfaces.Barriers;

public class Course {
    private final Barriers[] barriers;

    public Course(Barriers[] barriers) {
        this.barriers = barriers;
    }

    public Barriers[] getBarriers() {
        return barriers;
    }

    public void doIt(Team team){
        for (Action action : team.getPlayers()) {
            for (Barriers barrier : barriers) {
                if (barrier.getDistance() <= action.getMaxDistance()) {
                    barrier.setDoAction(true);
                } else {
                    barrier.setDoAction(false);
                }
                barrier.doAction(action);
            }
        }

    }
}
