package questions.strings;

import java.util.Scanner;

public class lowercaseVowels {
    //questions 1
    //count how many times lowercase vowels occured in a string entered by the user
    public static String countLowercase(String str){
        Integer count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'){
                count ++;
            }
        }

        return count.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The number of lower case vowels appearing in the string entered by the user are:" +countLowercase(str));
    }
    
}

