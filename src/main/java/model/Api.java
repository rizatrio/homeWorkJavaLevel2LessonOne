/* 
    Rizat.Orazalina created on 26.11.2021
*/

package model;

import interfaces.*;

import java.util.Scanner;


public class Api {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Human human1 = new Human("Саша");
        Human human2 = new Human("Женя");
        Human human3 = new Human("Марк");

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Мишка");

        Robot robot1 = new Robot("Алиса");
        Robot robot2 = new Robot("Сири");


        Action[] firstPlayers = new Action[]{human1, cat1, robot1, human3};
        Action[] secondPlayers = new Action[]{human2,cat2, robot2, cat3};

        Barriers[] barriers = new Barriers[] {new Wall(1000), new RunningTrack(1000)};
        Course course = new Course(barriers);

        Team firstTeam = new Team("Орлы", firstPlayers);
        Team secondTeam = new Team("Волки", secondPlayers);

        int teamCount = Team.count;

        while(teamCount!= 0) {
            Team team = null;
            System.out.println("Выберите команду: 1-Орлы, 2-Волки");
            int order = scanner.nextInt();
            if (order == 1) {
                team = firstTeam;
            }
            else {
                team = secondTeam;
            }

            System.out.println("Результаты команды " + team.getName());
            course.doIt(team);
            System.out.println("*************");
            teamCount --;
        }



    }
}
