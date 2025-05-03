
//fruits basket quesion leetcode (904)


class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> basket = new HashMap<>(); //creating an hashmap to check key value of the type of tree key = types of pair and value is the frequency
        int left =0;
        int maxFruits =0;
        for(int right =0;right<fruits.length;right++){ //here we are iterating it in fruits array
          basket.put(fruits[right], basket.getOrDefault(fruits[right],0)+1);   //here we are puting the value of the key value if does not exsisi in the map and also if its not then the default value would be the 0

         while(basket.size()>2){// if the basket size exceed the 2 then we have to remov the fruits from the basket we can add only 2 type of fruits

            int fruitCount = basket.get(fruits[left]); //coun the type of fruits in left side of the array
            if(fruitCount==1){ //if the fruitcount is 1 we can direclty remove it from the array

                basket.remove(fruits[left]);//direclty remove it

            }else{
                basket.put(fruits[left],fruitCount-1); //otherwise reduce its count by 1 if in valu of the particular tree
            }
            left++;
         } 
         maxFruits = Math.max(maxFruits, right-left+1);//her ewe are checking the maxfruits and its windowsize and returning it below
         
        }
        return maxFruits;
        
    }
}