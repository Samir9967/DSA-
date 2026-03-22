import java.util.Scanner;

/*
    Example:
    input: 1234
    output: 10
 */
public class SumOfDigits {
//    public static int CountNum(int num){
//        int digitCount = 0;
//        while(num != 0){
//            int remainder = num % 10;
//            digitCount = digitCount + 1;
//            num = num / 10;
//        }
//        return digitCount;
//    }
    public static int Sum(int num){
        int total = 0;
        while(num > 0){
            int remainder = num % 10;
            total = total + remainder;
            num = num / 10;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int digitCount = CountNum(num);
        int sum = Sum(num);
        System.out.println(sum);
    }
}
