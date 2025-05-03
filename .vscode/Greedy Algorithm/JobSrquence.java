//Job Sequencing Problem

import java.util.*;

class Job {
    int deadline, profit;

    Job(int deadline, int profit) {
        this.deadline = deadline;
        this.profit = profit;
    }
}

class Solution {

    // Function to find the maximum deadline for creating parent array
    private int find(int slot, int[] parent) {
        if (parent[slot] == slot) return slot;
        return parent[slot] = find(parent[slot], parent);
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;

        // Step 1: Create job array
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
        }

        // Step 2: Sort jobs by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 3: Find max deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 4: Initialize DSU parent array
        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        // Step 5: Schedule jobs
        int count = 0, totalProfit = 0;
        for (Job job : jobs) {
            int availableSlot = find(job.deadline, parent);
            if (availableSlot > 0) {
                count++;
                totalProfit += job.profit;
                parent[availableSlot] = find(availableSlot - 1, parent);  // Union
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(count);
        result.add(totalProfit);
        return result;
    }
}
