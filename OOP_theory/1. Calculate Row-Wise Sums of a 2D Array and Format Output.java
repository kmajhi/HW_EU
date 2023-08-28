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


/* Another way

    public class Main {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {1, 6, 3}, {1, 2, 10}};

        for (int i = 0; i < mat1.length; i++) {
            int sum = 0; // Initialize sum for each row
            for (int j = 0; j < mat1[i].length; j++) {
                sum += mat1[i][j]; // Add each element to the sum
            }
            System.out.print("[ ");
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j]);
                if (j < mat1[i].length - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" ] = " + sum);
        }
    }
}

//output 
[ 1 + 2 + 3 ] = 6
[ 1 + 6 + 3 ] = 10
[ 1 + 2 + 10 ] = 13

*/
