/*
 *    Rizat.Orazalina created on 26.11.2021
 */

package model;

import interfaces.Action;

public class Team {
    public static int count = 0;
    private static final int N = 4;
    private String name;
    private final Action[] players;

    public Team(String name, Action[] players){
        this.name = name;
        if(players.length != N) {
            throw new IllegalArgumentException("Число участников должен быть 4!!!");
        }
        this.players = players;
        count ++;
    }

    public String getName() {
        return name;
    }

    public Action[] getPlayers() {
        return players;
    }
}
