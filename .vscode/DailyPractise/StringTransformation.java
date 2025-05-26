class Solution {
    public int lengthAfterTransformations(String s, int t) {
        if(s.length()==0) return 0;
        StringBuilder string = new StringBuilder(s);
        int i=0;
        while(i<string.length() && k<0){
            char c = string.charAt(i);
            if(c=='z'){
                string.deleteCharAt(i);
                string.insert(i,"ab");
                i+=2;
            }else{
                string.charAt(i,(char)(c+1));
                i++;
            }
        }
        return sb.length();
    }
}