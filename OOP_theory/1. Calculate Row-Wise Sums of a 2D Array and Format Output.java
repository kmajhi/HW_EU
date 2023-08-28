public class Main {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {1, 6, 3}, {1, 2, 10}};

        System.out.print("[ ");
        for (int i = 0; i < mat1.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat1[i].length; j++) {
                sum += mat1[i][j]; 
            }
            System.out.print(sum);
            if (i < mat1.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" ]");
    }
}
