import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] parent = new int[n + 1];
        int[] respect = new int[n + 1];
        List<Integer>[] children = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            children[i] = new ArrayList<>();
        }

        // Read input and build tree
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int r = sc.nextInt();
            parent[i] = p;
            respect[i] = r;

            if (p != -1) {
                children[p].add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        boolean[] removed = new boolean[n + 1];

        while (true) {
            int removable = -1;

            // Find the smallest removable rebellious noble
            for (int i = 1; i <= n; i++) {
                if (removed[i] || parent[i] == -1 || respect[i] == 0) continue;

                boolean canRemove = true;
                for (int child : children[i]) {
                    if (!removed[child] && respect[child] == 0) {
                        canRemove = false;
                        break;
                    }
                }

                if (canRemove) {
                    removable = i;
                    break;
                }
            }

            if (removable == -1) break;

            // Remove the noble
            removed[removable] = true;
            result.add(removable);

            // Reassign its children to its parent
            for (int child : children[removable]) {
                if (!removed[child]) {
                    parent[child] = parent[removable];
                    children[parent[removable]].add(child);
                }
            }

            children[removable].clear(); // no more children
        }

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int noble : result) {
                System.out.print(noble + " ");
            }
        }
    }
}
