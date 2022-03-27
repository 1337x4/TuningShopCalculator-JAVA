import java.util.Scanner;
public class Chiptuning {
    public static void main(String[] args) throws Exception {
        int statevalue;
        int Lvl1engine;
        int Lvl2engine;
        int Lvl3engine;
        int Lvl4engine;
        int Lvl1brakes;
        int Lvl2brakes;
        int Lvl3brakes;
       
        double Lvl1suspension;
        double Lvl2suspension;
        double Lvl3suspension;
        double Lvl4suspension;
        int Lvl1transmission;
        int Lvl2transmission;
        int Lvl3transmission;
        int MaxPrice;
       
        double z = 33.3333333333333;
        double y = 16.66666667;
        double x = 8.333333333;
        double k = 4.166666667;
        double h = 2.84;
        



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your car state value ");
         statevalue = scanner.nextInt();

         Lvl1engine = Math.abs(statevalue/5);
         Lvl1brakes = Math.abs(statevalue/20);
         Lvl1suspension = Math.abs(statevalue/z);
         Lvl1transmission = Math.abs(statevalue/50);
         Lvl2engine = Math.abs(Lvl1engine * 2);
         Lvl2brakes = Math.abs(Lvl1brakes * 2);
         Lvl2suspension = Math.abs(statevalue/y);
         Lvl2transmission = Math.abs(Lvl1transmission * 2);
         Lvl3engine = Math.abs(Lvl1engine *3);
         Lvl3brakes = Math.abs(Lvl1brakes*3);
         Lvl3suspension = Math.abs(statevalue/x);
         Lvl3transmission = Math.abs(Lvl1transmission*3);
         Lvl4engine = Math.abs(Lvl1engine * 4);
         Lvl4suspension = Math.abs(statevalue/k);
         Lvl1suspension = Math.round(Lvl1suspension*100);
         Lvl1suspension = Math.round(Lvl1suspension/100);
         Lvl2suspension = Math.round(Lvl2suspension*100);
         Lvl2suspension = Math.round(Lvl2suspension/100);
         Lvl3suspension = Math.round(Lvl3suspension*100);
         Lvl3suspension = Math.round(Lvl3suspension/100);
         Lvl4suspension = Math.round(Lvl4suspension*100);
         Lvl4suspension = Math.round(Lvl4suspension/100);
         MaxPrice = (int) Math.abs(statevalue*h);
         
    




         System.out.println("Level 1 engine costs: $"+Lvl1engine);
         System.out.println("Level 2 engine costs: $"+Lvl2engine);
         System.out.println("Level 3 engine costs: $"+Lvl3engine);
         System.out.println("Level 4 engine costs: $"+Lvl4engine);
         System.out.println("Level 1 brakes costs: $"+Lvl1brakes);
         System.out.println("Level 2 brakes costs: $"+Lvl2brakes);
         System.out.println("Level 3 brakes costs: $"+Lvl3brakes);
         System.out.println("Level 4 brakes don't exsist :(");
         System.out.println("Level 1 suspension costs: $"+Lvl1suspension);
         System.out.println("Level 2 suspension costs: $"+Lvl2suspension);
         System.out.println("Level 3 suspension costs: $"+Lvl3suspension);
         System.out.println("Level 4 suspension costs: $"+Lvl4suspension);
         System.out.println("Level 1 transmission costs: $"+Lvl1transmission);
         System.out.println("Level 2 transmission costs: $"+Lvl2transmission);
         System.out.println("Level 3 transmission costs: $"+Lvl3transmission);
         System.out.println("Level 4 transmission upgrade don't exsist :(");
         System.out.println("Maxing your vehicle will cost you $"+MaxPrice);
         scanner.close();



    



    }
}
