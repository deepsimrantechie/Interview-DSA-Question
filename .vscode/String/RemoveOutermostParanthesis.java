//remove the outermost paranthestis of the string

class Solution{
    public string removeParan(String s){
        StringBuilder str = new StringBuilder();
        int opened =0;
        for(char c:s.toCharArray){
            if(c=="(" && opened++>0) str.append(c);
            if(c==")" && opened-->1) str.append(c);
        }
        return str.toString();
    }
}