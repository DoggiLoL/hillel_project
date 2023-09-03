package edu.hillel.lesson5.HomeWork5;

public class Participant {

    String Name;
    int runLimit;
    int jumpLimit;
    boolean inGame;

    public Participant(String name, int runLimit, int jumpLimit) {
        this.Name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

   public void run (int distant){
        if(inGame){
            if(runLimit>= distant){
                System.out.println("Участник " + Name + " пробежал " + distant + " метров.");
            } else {
                System.out.println("Участник " + Name + " не смог пробежать " + distant + " метров.");
                inGame = false;
            }
        }
    }

    public void jump (int height){
        if(inGame){
            if(jumpLimit>= height){
                System.out.println("Участник " + Name + " перепрыгнул через препятствие высотой в " + height + " метров.");
            } else {
                System.out.println("Участник " + Name + " не смог перепрыгнуть через препятствие высотой в " + height + " метров.");
                inGame = false;
            }
        }
    }
}
