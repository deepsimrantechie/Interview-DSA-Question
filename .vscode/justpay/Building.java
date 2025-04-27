import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no of rows input
        int m = sc.nextInt();//no of column input 

HashMap<Integer, List<Integer>> rowMap = new HashMap<>();
HashMap<Integer, List<Integer>> colMap = new HashMap<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int type = sc.nextInt();

                rowMap.putIfAbsent(type,new ArrayList<>());
                colMap.putIfAbsent(type, new ArrayList<>());

                rowMap.get(type).add(i);
                colMap.get(type).add(j);

            }
        }

        sc.close();
        long totalDistance =0;
        //for each building type calculate distance sums
        for(Integer type:rowMap.keySet()){
            List<Integer> rows = rowMap.get(type);
            List<Integer> cols = colMap.get(type);

            Collections.sort(rows);
Collections.sort(cols);


            totalDistance += computeSum(rows);

            totalDistance += computeSum(cols);

        }

        System.out.print(totalDistance);
    }

    public static long computeSum(List<Integer> list){
        long sum =0;
        long prefixSum = 0;

        for(int i=0;i<list.size();i++){
           sum += (long) list.get(i) * i - prefixSum;
prefixSum += list.get(i);
        }
        return sum;
    }
}