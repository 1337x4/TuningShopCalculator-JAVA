import java.util.Scanner;

public class COVID {
    public static void main(String[] args) throws Exception {
        
        double X;
        double Y;
        double Z;
        int K =100;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of new cases: ");
        Y = scanner.nextDouble();

        System.out.println("Enter the number of PCR tests: ");
        Z = scanner.nextDouble();

    

        X = Y/Z * K;

        System.out.println("The percentage of new cases is: "+X+"%");

        if(X < 2){
            System.out.println("The Alert Level is green "+X+"%");
        }
        else if (X>=2 && X<=5){
            System.out.println("The Alert Level is yellow ");
            }
         if(X>5 && X<8 ){
             System.out.println("The Alert Level is orange ");
         }
         else if (X>8){
             System.out.println("The Alert Level is red ");

         }
         scanner.close();
        
        

    

    
       



        





    }
}
