//Nama  : Reyhan Fajar Pamenang
//NPM   : 2006577486
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello! Selamat datang dimatakuliah OOP");
        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*3;
        int sum = myFirstNumber+mySecondNumber+myThirdNumber;
        int myLastNumber = 1000-sum;
        System.out.println(sum + " dan " + myLastNumber);

        boolean isValid = (mySecondNumber>10) ? true:false;
        System.out.println(isValid);
        if(isValid == true){
            myLastNumber+=sum;
            System.out.println(myLastNumber);
        }
        int i = 0;
        i = i++ +1;
        System.out.println(i);
    }
}