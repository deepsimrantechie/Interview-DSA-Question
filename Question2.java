///to check either a number is plaindrome or not 


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}









//first example
{/**the 
step 1:race a car //remove all the space from it or all the sign and everything
step 2: it will be like raceacar a complete without the space between them.
step 3: now we will check with left and right if left is smaller than right then it will check the 
step 4: check the if condition
step 5: it will answer in true or false

 */}