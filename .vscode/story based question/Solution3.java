
class public Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] edge = new int[n];
        for(int i=0;i<n;i++){
            edge[i] = sc.nextInt();
        }

        //check the weight array
        int[] weight = new int[n];
        for(int i=0;i<n;i++){
            int to = weight[i];
            if(to != -1){
                weight[to] += i;
            }
        }


        //check the maxnode
        int maxWeight =0;
        int maxnode=0;
        for(int i=0;i<n;i++){
            if(weight[i]>maxWeight || (weight[i]==maxWeight && i>maxnode)){
                maxWeight = weight[i];
                maxnode = i;
            }
        }
        System.out.print(maxnode);
    }
}