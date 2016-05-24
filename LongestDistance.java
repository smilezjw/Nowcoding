/*
*题目描述
*
*有一个长为n的数组A，求满足0≤a≤b<n的A[b]-A[a]的最大值。
*给定数组A及它的大小n，请返回最大差值。
*测试样例：[10,5],2 返回：0
*这道题和Best Time to Buy and Sell Stock类似，
*都是更新历史最小值，当前值-历史最小值>最大值？
*
*/

public class LongestDistance{
	
	public int getDis(int[] A, int n){
		if(null == A || n <= 0){
			return 0;
		}
		int minNum = A[0];
		int maxDis = 0;
		for(int i=1; i < n; i++){
			maxDis = A[i] - minNum > maxDis ? A[i] - minNum : maxDis;
			minNum = A[i] < minNum ? A[i] : minNum;
		}
		return maxDis;
	}

}