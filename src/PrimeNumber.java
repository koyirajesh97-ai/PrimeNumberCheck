import java.util.Scanner;
// ok

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // works fine for now
        // minor changes
        System.out.println("enter a number");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag && num > 1){
            System.out.println(num + " is prime");
            // can be optimized later
        }else{
            System.out.println(num + " is not prime");
            // works as expected
        }
        sc.close();
    }
}
