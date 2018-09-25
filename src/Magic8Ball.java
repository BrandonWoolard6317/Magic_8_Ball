import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        //Declaring Variables
        String usersInput;
        int generatedNumber;
        int Questioning;

        //Initializing Variables
        Scanner keyboard = new Scanner(System.in);
        generatedNumber = (int) (Math.random() * 100);

        
        
        System.out.println("Lets play Magic 8 Ball! Select a number between 0-100");
        usersInput = keyboard.nextLine();
        Questioning = Integer.parseInt(String.valueof(usersInput));
        
        if(Questioning <= 0){
             System.out.println("Too low of a number!");
         }
         else if(Questioning <= 10){
         else if(Questioning < 10){
             System.out.println("You will be surrounded by loved ones your entire life.");
         }
         else if(Questioning >= 11){
         else if(Questioning < 20){
             System.out.println("You will always be alone.");
         }
         else if(Questioning >= 21-30){
         else if(Questioning < 30){
             System.out.println("You will have endless amounts of money.");
         }       
         else if(Questioning == 31-40){
         else if(Questioning < 40){
             System.out.println("You will never make it above medium class in wealth.");
         }        
         else if(Questioning == 41-50){
         else if(Questioning < 50){
             System.out.println("You will have bad luck for the rest of your life.");
         }      
         else if(Questioning == 51-60){
         else if(Questioning < 60){
             System.out.println("You will have many great things coming soon.");
         }       
         else if(Questioning == 61-70){
         else if(Questioning < 70){
             System.out.println("You will never be ill.");
         }       
         else if(Questioning == 71-80){
         else if(Questioning < 80){
             System.out.println("You will have bad fortune for many years to come.");
         }      
         else if(Questioning == 81-90){
         else if(Questioning < 90){
             System.out.println("You will have great fortune.");
         }      
         else if(Questioning == 91-100){
         else if(Questioning <= 100){
             System.out.println("You are not awesome.");
         }
         else if(Questioning > 100){
         else if(Questioning >= 101){
             System.out.println("Too high of a number!");
         }
        
             
             
             
        /*Loop 
        System.out.println("Let's play Magic 8 Ball!\nPress 1 to play\nPress 2 to exit");
        usersInput = keyboard.nextLine();
        Questioning = Integer.parseInt(String.valueOf(usersInput));

        if (Questioning == 1) {
            //Printing out users Magic 8 Ball result
            if (generatedNumber < 10) {
                System.out.println("You will be surrounded by loved ones your entire life.");
            } else if (generatedNumber < 20) {
                System.out.println("You will always be alone.");
            } else if (generatedNumber < 30) {
                System.out.println("You will have endless amounts of money.");
            } else if (generatedNumber < 40) {
                System.out.println("You will never make it above medium class in wealth.");
            } else if (generatedNumber < 50) {
                System.out.println("You will have bad luck for the rest of your life.");
            } else if (generatedNumber < 60) {
                System.out.println("You will have many great things coming soon.");
            } else if (generatedNumber < 70) {
                System.out.println("You will never be ill.");
            } else if (generatedNumber < 80) {
                System.out.println("You will have bad fortune for many years to come.");
            } else if (generatedNumber < 90) {
                System.out.println("You will have great fortune.");
            } else if (generatedNumber <= 100) {
                System.out.println("You are not awesome.");
            }
        }else if(Questioning == 2){
            System.exit(0);
        }
        //Loop to keep playing
        boolean Loop = true;
        while(Loop){
            System.out.println("\nDo you want to play again?\n1 Yes\n2 No");
            usersInput = keyboard.nextLine();
            Questioning = Integer.parseInt(String.valueOf(usersInput));
            generatedNumber = (int) (Math.random() * 100);
            if (Questioning == 1){
                if (generatedNumber < 10) {
                    System.out.println("You will be surrounded by loved ones your entire life.");
                } else if (generatedNumber < 20) {
                    System.out.println("You will always be alone.");
                } else if (generatedNumber < 30) {
                    System.out.println("You will have endless amounts of money.");
                } else if (generatedNumber < 40) {
                    System.out.println("You will never make it above medium class in wealth.");
                } else if (generatedNumber < 50) {
                    System.out.println("You will have bad luck for the rest of your life.");
                } else if (generatedNumber < 60) {
                    System.out.println("You will have many great things coming soon.");
                } else if (generatedNumber < 70) {
                    System.out.println("You will never be ill.");
                } else if (generatedNumber < 80) {
                    System.out.println("You will have bad fortune for many years to come.");
                } else if (generatedNumber < 90) {
                    System.out.println("You will have great fortune.");
                } else if (generatedNumber <= 100) {
                    System.out.println("You are not awesome.");
                }
            } else if(Questioning == 2){
                System.exit(0);
            }
        }*/
             
             
    }
}
