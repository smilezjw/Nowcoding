/*
*世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？ 
*输入例子: 1999 2299  输出例子: 7
*
*/

public class CountBitDiff{
	
	public int countBitDiff(int m, int n){
		int xor = m ^ n;
		return numOf1Bit(xor);
	}

	public int numOf1Bit(int x){
		int cnt = 0;
		while(x != 0){
			cnt++;
			x &= x - 1;
		}
		return cnt;
	}

}
