import java.util.*;

public class matricesOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int result[][] = new int[2][2];

        System.out.println("Enter elements of 1st matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Choose an operation:\n12" + " 1.Addition\n" + " 2.Multiplication\n" +" 3.Transpose" );
        int choice = sc.nextInt();
        
     
        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                System.out.println("Addition of two matrices:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += arr1[i][k] * arr2[k][j];
                        }
                    }
                }
                System.out.println("Multiplication of two matrices:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Transpose of the first matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(arr1[j][i] + " ");
                    }
                    System.out.println();
                }

                System.out.println("Transpose of the second matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(arr2[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Enter a valid number (1-3)");
        }

     
    }
}
