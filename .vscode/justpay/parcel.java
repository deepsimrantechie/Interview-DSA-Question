import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            p.add(x);
            while (i < n && arr[i] == x) {
                i++;
            }
            i--; // because for loop will also increase i
        }

        int i = 0, j = 0;
        int ans = 0, cnt = 0;
        int size = p.size(); // Important: now n changes to p.size()

        while (j < size) {
            while (j < size && p.get(j) - p.get(i) < n) {
                j++;
            }
            cnt = j - i;
            ans = Math.max(ans, cnt);
            while (j < size && p.get(j) - p.get(i) >= n) {
                i++;
            }
        }

        System.out.println(ans);
    }
}
