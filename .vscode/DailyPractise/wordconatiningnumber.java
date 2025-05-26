class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<words.length;i++){
            if(word(i).contains(String.valueOf(x))){
                ans.add(i);
            }
        }
    return ans;
    }
}
