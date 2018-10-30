import java.util.Scanner;

public class Main {
    public static void fillMatrix(byte[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (byte)(Math.random() * 100);
            }
        }
    }

    public static void printMatrix(byte[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < 10){
                    System.out.printf(" %d ", matrix[i][j]);
                }
                else{
                    System.out.printf("%d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void changeMatrix(byte[][] matrix){
        byte[] temp;
        int last = matrix.length - 1;
        for (int i = 0; i < last; i++, last--){
            temp = matrix[i];
            matrix[i] = matrix[last];
            matrix[last] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Цехмейструк Андрей");
        System.out.println("Введите размер матрицы: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        byte[][] matrix = new byte[size][size];
        fillMatrix(matrix);
        printMatrix(matrix);
        System.out.println("\nПосле изменений\n");
        changeMatrix(matrix);
        printMatrix(matrix);

    }
}
