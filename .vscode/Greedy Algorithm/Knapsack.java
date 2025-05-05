//fractional knapsack problem 

class Pair{
    int value,weight;
    double ratio;
    Pair(int value,int weight){
        this.value = value;
        this.weight = weight;
        this.ratio = (double)value/weight;
    }

    class Solution{
        double fractionalknapsack(int[] values, int[] weight,int w){
            int n = values.length;
            ArrayList<Pair> items = new ArrayList<>();
            for(int i=0;i<n;i++){
                items.add(new Pair(value[i],weight[i]));

            }

            items.sort((a,b)->double.compare(b.ratio,a.ratio));

            double totalProfit =0;
            for(Pair item:items){
                if(w>= item.weight){
                    totalProfit+= item.value;
                    w-= item.weight;
                }else{
                    totalProfit += item.ratio*w;
                    w=0;
                    break;
                }
                ;
            }
        }
        return totalProfit
    }
}