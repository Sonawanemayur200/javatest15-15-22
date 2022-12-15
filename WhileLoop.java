import java.util.Scanner;
class WhileLoop {
    public static void main(String[] args) {
    
        int n = 10;
        int n1= 1;
        int EvenSum=0;
        int Oddsum =0;
        while(n1<=n){
            if(n1%2==0){
                System.out.print("Even Number: "+n1+"  ");
                EvenSum+=n1;
            }
            else{
                System.out.println("Odd Number : "+n1+"  ");
                Oddsum+=n1;
            }
            n1++;
        }
        System.out.println("Sum of Even Nunmber : "+EvenSum);
        System.out.println("Sum of Odd Nunmber : "+Oddsum);
    }
}