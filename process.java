import java.util.Scanner;

public class process {

        static Scanner keyboard = new Scanner(System.in);
        public static void main(String[] args){
            int input = collectData();
            int digit = rangeCheck(input);

            matchToWords(input,digit);
        }

        public static int collectData(){
            int input;
            Boolean withinRange = true;
            do{

                System.out.println("Please input a number from 0-100");
                input = keyboard.nextInt();
                if (input <0 || input >100){
                    System.out.println("out of the range");
                    withinRange = false;
                }else withinRange = true;
            } while(withinRange==false);
            System.out.printf("The number you input: %s\n", input);
            return input;

        }

        public static int rangeCheck(int input){
            String inputWithinRange = Integer.toString(input);
            int length =inputWithinRange.length();
           // System.out.printf("%d", length);
            return length;
        }

        public static void matchToWords(int input, int digit){
           String[] digits = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
           String[] tens_digitSmallerThan20 = {"ten","eleven", "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
           String[] tens_digit = {"","", "twenty-","thirty-","forty-","fifty-","sixty-","seventy-","eighty-","ninety-"};
           String[] hundreds_digit = {"","one", "two","thirty-","forty-","fifty-","sixty-","seventy-","eighty-","ninety-"};

            if(input==20){
                System.out.println("20 is twenty");
            }
            else if (digit == 1){
                System.out.printf("%s is %s",input,digits[input]);
            }
            else if (digit == 2 && input<20){
                System.out.printf("%s is %s",input,tens_digitSmallerThan20[input%10]);
            }
            else if (digit == 2 && input>=20){
                System.out.printf("%s is %s",input,tens_digit[input/10]+digits[input%10]);
            }
            else if (digit == 3){
                System.out.printf("%s is %s-hundred",input,hundreds_digit[input/100]);
            }
        }
    }

