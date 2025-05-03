//N-MEETINGS IN ONE ROOM 
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        //create a list to pass (start[i]-nd[i]);
        ArrayList<int[]> meetings = new ArrayList<>();
        for(int i=0;i<n;i++){
            meetings.add(new int[]{start[i],end[i]});
        }
        
        //step2 sort on the basis of the end array or ending of the meetings
        meetings.sort((a,b)->a[1]-b[1]);
        //step3 = greedily solve the problem sleect non overlapping interval
        int count =0;
        int lastEndTime =-1;
        for(int[] meeting:meetings){
            if(meeting[0]>lastEndTime){
                count++;
                lastEndTime = meeting[1];
            }
        }
        return count;
    }
}