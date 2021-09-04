package GameTime;

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Player, Enter your name please:");
        String name = sc.nextLine();
        String player;

        while (true) {
            String[] rps =  {"rock" , "paper", "scissor"}; //string array to store game moves
            int r = rand.nextInt(rps.length); //generates random int upto length of the array i.e., 0 to 2
            String comp = rps[r];  //will pass that random int as the index element of the rps array to fetch  random elemnets from those array elements.
            

            while (true) {
                System.out.println(name+", please enter your move (rock - paper - scissor)");
                player = sc.nextLine();
                for (int i = 0; i < 5; i++) {
                    System.out.println(" . ");
                }
                System.out.println("Waiting for Computer's move...");
                if (player.equals("rock") || player.equals("paper") || player.equals("scissor")) {
                    break;
                } // exit the infinite loop if player choose the correct move name.
                System.out.println("Opps ! that wasn't a Valid move, "+name);
            } //exiting the infinite loop as player choosed the correct move .
            System.out.println("------------");
            System.out.println("Computer's Move is: "+comp);
            
            if (player.equals(comp)) {
                System.out.println("The game was a tie!");
            }
            else if (player.equals("rock")) {
                if (comp.equals("paper")) {
                    System.out.println("Argh! computer won");
                }
                else if(comp.equals("Scissor")){
                    System.out.println("Bravo! "+name+", you Win");
                }
            }/////

            else if (player.equals("paper")) {
                if (comp.equals("scissor")) {
                    System.out.println("Argh! computer won");
                }
                else if(comp.equals("rock")){
                    System.out.println("Bravo! "+name+", you Win");
                }
            }/////

            else if (player.equals("scissor")) {
                if (comp.equals("rock")) {
                    System.out.println("Argh! computer won");
                }
                else if(comp.equals("paper")){
                    System.out.println("Bravo! "+name+", you Win");
                }
            }/////

            System.out.println("Wanna continue Playing? (y/n) ");
            String yorn = sc.nextLine();
            if (!yorn.equals("y")) {
                break;
            }
        }
        System.out.println("Ciao ,"+name+" ! See ya again...");
        sc.close();
    }
}
