class Solution{
    public String rotate(String s){
        String[] word = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(word).append(i>0? " ":"");
        }
        return result.toString();
    }
}