
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's Prime: ");
        int number = sc.nextInt();
        System.out.println(number+" is Prime?: "+isPrime(number));
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}