import java.util.Scanner;

public class PrintRowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][2];

//        Inserting Element in the array
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        Printing the 2-D array row wise
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
