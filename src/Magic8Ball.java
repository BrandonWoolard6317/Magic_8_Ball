import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args){
        String usersInput;
        int Questioning;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's play Magic 8 Ball!\nPick a number between 1-100");
        usersInput = keyboard.nextLine();
        
        usersInput = Integer.parseInt(String.valueOf(Questioning));
        if(Questioning == 0){
            System.out.println("Too low of a number!")
        }
        else if(Questioning == 1-10){
            System.out.println("");
        }
        else if(Questioning == 11-20){
            System.out.println("");
        }
        else if(Questioning == 21-30){
            System.out.println("");
        }       
        else if(Questioning == 31-40){
            System.out.println("");
        }        
        else if(Questioning == 41-50){
            System.out.println("");
        }      
        else if(Questioning == 51-60){
            System.out.println("");
        }       
        else if(Questioning == 61-70){
            System.out.println("");
        }       
        else if(Questioning == 71-80){
            System.out.println("");
        }      
        else if(Questioning == 81-90){
            System.out.println("");
        }      
        else if(Questioning == 91-100){
            System.out.println("");
        }
        else if(Question > 100){
            System.out.println("Too high of a number!")
        }
        














    }
}
