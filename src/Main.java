import java.util.Scanner;

public class Main {

    public static final String PRINT_MESSAGE = "Введите целое положительное число:";
    public static int scanInt(){
        int N = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(PRINT_MESSAGE);
            while (!scanner.hasNextInt()){
                System.out.println(PRINT_MESSAGE);
                scanner.next();
            }
            N = scanner.nextInt();
        }while (N <= 0);
        return N;
    }

    public static double scanA(){
        double N = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Введите a: ");
            scanner.next();
        }

        N = scanner.nextDouble();
        return N;
    }

    public static void main(String[] args) {

        int N = scanInt();

        double a = scanA();

        int count = 0, i_1 = 3, i_2 = 2, i_3 = 1, ii = 0;

        for(int i = 1; i < N; i++){
            if (i <= 3){
                System.out.println(i);
                if (i < a) {
                    count = count + i;
                }
            }
            else {
                ii = i_1 + i_2 - (2 * i_3);
                System.out.println(ii);
                i_3 = i_2;
                i_2 = i_1;
                i_1 = ii;
                if (i_1 < a) {
                    count = count + ii;
                }
            }
        }

        System.out.print("Сумма: ");
        System.out.println(count);
    }
}