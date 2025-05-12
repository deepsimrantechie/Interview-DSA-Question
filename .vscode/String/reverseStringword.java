//reverse the string words in the java

class Solution{
    public string reverseWord(String s){
         char[] words = s.trim().split("\\s+");
    StringBuilder result = new StringBuilder();
    for(int i<words.length-1;i>=0;i--){
        result.append(words[i]).append(i>0?" ":"");
    }
    }
return result.toString();
}