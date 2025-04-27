import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.trim().toLowerCase();  // Fixed toLowerCase()
        
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                System.out.println("No, it is not a palindrome.");
                return; // Exit immediately if not palindrome
            }
        }

        System.out.println("Yes, it is a palindrome.");
    }
}
