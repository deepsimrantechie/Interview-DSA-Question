//calculatint the price of lmondae which cost 5 dollar customer can pay 5 ,10 ,20 dollar currency so we have to write the code which may check the comupation and return the boolean anwer
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        int twenty =0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            if(bills[i]==10){
                if(five>=1){
                    ten++;
                    five--;
                }else{
                    return false;
                }
            }

            if(bills[i]==20){
                if(ten>=1 && five>=1){
                    twenty++;
                    ten--;
                    five--;
                }else if(five>=3){
                    five -=3;
                }else{
                    return false;
                }
            }
        }
        return true;
        
    }
}