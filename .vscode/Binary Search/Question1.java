class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //here we are checking the number of rows and column
        int n = matrix.length;//no of rows is in n
        int m = matrix[0].length;//no of coloums in the m 
        
        int i = 0;//here we are chekcing it from zero means checking it from last
        int j = m-1;//here we are chcking from top last
        
        while(i<n && j>=0){//condition for iterating the matrix in a right way
            if(matrix[i][j]==target){
                return true;//here if we found the target then we are returning true 
            }
            if(matrix[i][j]>target){ // if matrix is greater thant he target than print it 
                j--;
            }else{
                i++;
            }
        }
        return false;
        
    }
}



{/**Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true 


explaination:
we will check it means n= 3 and m = 4 and then according to this
 
 i<n  means 0<3 and 
 j>=0 means j = m-1 j =4-1 = 3 and thasts means the j is 3 and also 3>=0 
 then it will check and decremnet or increase the value of i and j according to the element 









 */}