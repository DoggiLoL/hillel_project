package edu.hillel.lesson5.HomeWork5;

public class Main {


    public static void main(String[] args) {
        Participant [] participants = {
                new Human("Толик", 100, 2),
                new Cat("Блоха", 150, 3),
                new Robot("R2-D2", 200, 1)
        };
        Obstacle[] obstacles = {
                new Treadmill("Дорожка 1", 50),
                new Wall("Стенка 1", 1),
                new Treadmill("Дорожка 2", 80)
        };

        for (Participant participant : participants){
            for(Obstacle obstacle : obstacles){
                if(participant.inGame){
                    if(obstacle instanceof Treadmill){
                        participant.run(obstacle.getValue());
                    } else if (obstacle instanceof Wall) {
                        participant.jump(obstacle.getValue());
                    }
                }
            }
        }
    }
    }
