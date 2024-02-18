import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


//         1- Write a Java method to find the smallest number among three numbers


//        System.out.println("Input the first number : ");
//        int first = s.nextInt();
//
//
//        System.out.println("Input the Second number : ");
//        int second = s.nextInt();
//
//
//        System.out.println("Input the third number : ");
//        int third = s.nextInt();
//
//       number(first ,second ,third);


//        2 - Write a Java method that check if the entered number is negative or positive or zero

//
//        System.out.println("please enter number : ");
//        int num = s.nextInt();
//
//        numbers(num );




//        3 - Write a Java method to check whether a string is a valid password. Password rules:
//A password must have at least ten characters.
//A password consists of only letters and digits.
//A password must contain at least two digits.


//        System.out.println("1. A password must have at least eight characters.\n" +
//                "2. A password consists of only letters and digits.\n" +
//                "3. A password must contain at least two digits");
//
//        System.out.println("Enter a password (You are agreeing to the above Terms and Conditions.) : ");
//        String pass = s.nextLine();
//          if (isValid(pass)){
//              System.out.println("valid password");
//          } else {
//              System.out.println("Invalid password");
//          }
//
//
//
//
//
//
//
 }


        //   Q1


//    public static void number ( int first , int second , int third ){
//
//        if ((first < second)&& (first < third)){
//            System.out.println("The smallest value is : " + first);
//        } else if ((second < first)&& (second < third)) {
//            System.out.println("The smallest value is : " + second);
//        } else {
//            System.out.println("The smallest value is : " + third);
//
//        }
//
//
//    }



        //   Q2


//    public static void numbers ( int num){
//
//
//
//            if (num > 0) {
//                System.out.println(num + " is positives ");
//
//            } else if (num < 0) {
//                System.out.println(num + " is negatives ");
//            } else {
//                System.out.println("the number is Zero ");
//            }
//
//
//    }




        //  Q3

//    public static boolean isValid( String pass ){
//
//        if(pass.length() < 10){
//            return false;
//        }
//
//        int digitCount = 0 ;
//        for (int i = 0; i < pass.length() ; i++) {
//            char c = pass.charAt(i);
//            if (!Character.isLetterOrDigit(c)){
//                return false ;
//            }
//            if (Character.isDigit(c)){
//                digitCount ++ ;
//
//            }
//        }
//        return digitCount >= 2;
//
//
//    }


}