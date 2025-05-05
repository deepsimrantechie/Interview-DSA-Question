{/**
In greedy we often sort the array on the basis of the greedy algorithm for example sorting an arrray on the basis of their
end point or also the comparision of the ratio of the divison in the reedy method this are the very often ways to slve the 
greey method one of them example are listed below for solving the array or sorting the array
 */}


 class Solution{
    public int sorting(int intervals[]){
        Arrays.sort(interval,(a,b)->Integer.compare(a[1],b[1]));
    }
 }

 //we can also make a custom class to sort the and compare the parameters

 class Pair{
    int value ;
    int weight;
     double ration;
     int(int value,int weight){
        this.value;
        this.weight;
        this.ratio = (double)value/weight;

     }
 }
 class Solution{
    double comparingtheratio(int value[] , int weight[]){
      List<int[]> items = new ArrayList<>();
      items.sort((a,b)->Double.compare(a.ratio,b.ratio));
    }
 }