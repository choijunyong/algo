package algo;
import java.util.*;
public class programmers_top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sl = new Solution();
		int testcase[] = {6,9,5,7,4};
		int result[] ;
		result = sl.solution(testcase);
		System.out.println(Arrays.toString(result));
	}

}

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int [heights.length];
        int[] arr = new int[heights.length+1];
        int[] answer1 = new int [heights.length+1];
        for (int i = heights.length; i >= 1; i-- ) {
            arr[i] = heights[i-1];
        }
        for(int i = heights.length; i >= 1 ; i--)
        {
            if(i == 0) {
                answer[i] = 0;
                break;
            }
            int max = arr[i];
            int idx = 0;
            int flag = 0;
            for(int j = i - 1 ; j >= 1; j--){
                int tmp = arr[j];
                if( max < tmp){
                    idx = j;
                    flag = 0;
                    break;
                }
                else if (max > tmp) continue;
                else flag = 1;
                
            }
            if(flag == 1) answer1[i] = 0;
            else answer1[i]= idx;
        }
        for(int i =1 ; i<= heights.length; i++) answer[i-1] = answer1[i];
        return answer;
    }
}