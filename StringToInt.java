import java.util.Scanner;

public class StringToInt {

     public static void main(String []args){
      
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] arr = input.split(";");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(convert(arr[i]) + " ");
        }
        
     }
     
     public static int convert(String input) {
         switch(input) {
            case "zero":
                 return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return 0;
         }
     }
}
