import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args){
        //Declaring variables
        String usersInput;
        int Questioning;
        
        //initializing Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Grabbing users input
        System.out.println("Let's play Magic 8 Ball!\nPick a number between 1-100");
        usersInput = keyboard.nextLine();
        usersInput = Integer.parseInt(String.valueOf(Questioning));
        
        //Printing out users Magic 8 Ball result
        if(Questioning == 0){
            System.out.println("Too low of a number!")
        }
        else if(Questioning == 1-10){
            System.out.println("You will be surrounded by loved ones your entire life.");
        }
        else if(Questioning == 11-20){
            System.out.println("You will always be alone.");
        }
        else if(Questioning == 21-30){
            System.out.println("You will have endless amounts of money.");
        }       
        else if(Questioning == 31-40){
            System.out.println("You will never make it above medium class in wealth.");
        }        
        else if(Questioning == 41-50){
            System.out.println("You will have bad luck for the rest of your life.");
        }      
        else if(Questioning == 51-60){
            System.out.println("You will have many great things coming soon.");
        }       
        else if(Questioning == 61-70){
            System.out.println("You will never be ill.");
        }       
        else if(Questioning == 71-80){
            System.out.println("You will have bad fortune for many years to come.");
        }      
        else if(Questioning == 81-90){
            System.out.println("You will have great fortune.");
        }      
        else if(Questioning == 91-100){
            System.out.println("You are not awesome.");
        }
        else if(Question > 100){
            System.out.println("Too high of a number!")
        }
    }
}
