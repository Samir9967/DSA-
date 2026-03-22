import java.util.Scanner;
/*
Example
    Find prime number in given
    input firstNumber =  10
    input lastnumber = 50
 */
public class PrimeNumberRange{
    public static boolean PrimeNumber(int num){
        int count = 0;
        for(int i = 1;i <= num;i++){
            if(num % i == 0){
                count+=1;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int startNumber = sc.nextInt();
        int lastNumber = sc.nextInt();
        for(int i = startNumber;i <= lastNumber;i++){
            if(PrimeNumber(i)== true){
                System.out.println(i);
            }
        }
    }
}
