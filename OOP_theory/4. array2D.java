public class Main {
    public static void main(String[] args) {
        int[][] array2D = {
                {99, 42, 74, 83, 100},
                {90, 91, 72, 88, 95},
                {88, 61, 74, 89, 96},
                {61, 89, 82, 98, 93},
                {93, 73, 75, 78, 99},
                {50, 65, 92, 87, 94},
                {43, 98, 78, 56, 99}
        };
        for (int i=0; i< array2D.length; i++){
            for (int j=0; j< array2D[i].length; j++){
                int element= array2D[i][j];
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
