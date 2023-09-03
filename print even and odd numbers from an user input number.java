import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nOdd\t\tEven");
        System.out.println("****\t****");
        for (int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println(i+ "\t\t");
            }

            for (int j=1; j<=n; j++){
                if(i%2!=0){
                    if (j==n){
                        System.out.print(i+"\t\t");
                    }
                }
            }
        }
    }
}
