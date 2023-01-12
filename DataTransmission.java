package Pratice;
import java.util.*;
public class DataTransmission {
	public static boolean isPrimeNumber(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace(";", "");
        String[] inputArray = input.split(" ");
        int[] resultArray = new int[0];
        int primeCount=0;
        for(int i=0;i<inputArray.length;i++){
            boolean result = isPrimeNumber(Integer.parseInt(inputArray[i]));
            if(result == true){
                resultArray = Arrays.copyOf(resultArray, resultArray.length+1);
                resultArray[resultArray.length-1] = Integer.parseInt(inputArray[i]);
                primeCount++;
            }
        }
        Arrays.sort(resultArray);
        System.out.println(resultArray[resultArray.length-2]+primeCount);
		
	}
}
