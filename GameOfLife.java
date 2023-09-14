

import java.util.Scanner;



public class GameOfLife {
    public static void main(String[] args){
        Scanner myInput= new Scanner(System.in); 
    System.out.print("skriv inn antall rader:");
        int rader= myInput.nextInt();
    System.out.print("skriv inn antall kolonner:");
        int kolonner=myInput.nextInt();
    Verden nyVerden=new Verden(rader, kolonner);
    String bokstav;

    
   
    do {//Programmet skal fortsette så lenge q-bokstav ikke trykkes .
        nyVerden.tegn();
        nyVerden.oppdatering();
        System.out.println("Trykk paa q dersom du vil avslutte.");
        bokstav = myInput.next();

    }while(!bokstav.equals("q"));

   

    



    }
    
}
