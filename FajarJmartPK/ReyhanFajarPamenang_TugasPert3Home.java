//Nama  : Reyhan Fajar Pamenang
//NPM   : 2006577486

import java.util.Scanner;

public class ReyhanFajarPamenang_TugasPert3Home{

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int total = 0;

            for(int i = 1; i<=10; i++){
                System.out.println("Enter number #" + i + ":");
                if(in.hasNextInt()){
                    int num = in.nextInt();
                    total += num;
                }
                else{
                    in.next();
                    System.out.println("Invalid Number!");
                    i--;
                }
            }
        
        System.out.println("Total is = " + total);
        in.close();
    }
    /*
        int control = 1;

        while(control != 3){
            System.out.println("Want to try calculator?");
            char approve = in.next().charAt(0);

            switch(approve){
                case 'Y': case 'y':
                    System.out.println(Calculator(0));
                    control = 2;
                    break;
                case 'N': case 'n':
                    System.out.println(Calculator(0));
                    control = 2;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
*/
}