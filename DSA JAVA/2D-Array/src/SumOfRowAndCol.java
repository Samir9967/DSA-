import java.util.Scanner;

public class SumOfRowAndCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][3];

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < arr.length;i++){
            int rowTotal = 0;
            for(int j = 0;j < arr[i].length;j++){
                rowTotal = rowTotal + arr[i][j];
            }
            System.out.println(rowTotal);
        }
    }
}
