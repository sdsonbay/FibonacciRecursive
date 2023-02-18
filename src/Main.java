import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(fibonacci(number));
    }
    
    public static int fibonacci(int number){
        if(number == 2 || number == 1){
            return 1;
        }
        else if(number == 0){
            return 0;
        }
        else{
            return fibonacci(number - 1) + fibonacci(number  - 2);
        }
    }
}
