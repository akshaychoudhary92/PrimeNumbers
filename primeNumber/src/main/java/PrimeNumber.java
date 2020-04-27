import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    public void isItPrime() {
        String input = "";
        List<Integer> primeList = new ArrayList<>();
        do {
            Scanner s = new Scanner(System.in);
            int num;
            int count = 0;
            System.out.println("Enter any number");
            num = s.nextInt();
            for(int i = 2; i <=(num/2); i++){
                if((num % i)== 0){
                    count++;
                    break;
                }
            }
            if((count ==0) && (num != 1)){
                System.out.println(num + " is a prime number.");
                primeList.add(num);
                System.out.println("do you wanna continue? \"yes\" or \"no\"");
                input = s.next();



            }else{
                System.out.println(num + " is not a prime number.");
                System.out.println("do you wanna continue? \"yes\" or \"no\"");
                input = s.next();
            }




        }while (input.equals("yes"));

        printPrimeNumbers(primeList);

    }

    public List<Integer> printPrimeNumbers(List<Integer> p){
        p.forEach((n) -> System.out.println(n));
        return p;


    }



}