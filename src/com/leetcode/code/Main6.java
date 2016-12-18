package com.leetcode.code;
//AC
public class Main6 {
	public static void main(String args[]) {
		String s = convert("sfsdfvwefwf",3);
		System.out.println(s);
	}
	public static String convert(String s, int numRows) {
		if(numRows == 1) return s;
		int length = s.length();
		//考虑太复杂，直接取奇数位偶数位就行了
		/*if(numRows == 2){
			int n = 0;
			String syi = "";
			String ser = "";
			for(; 4*n+4<length; n++){
				
				syi = syi + s.charAt(4*n) + s.charAt(4*n+3);
				ser = ser + s.charAt(4*n+1) + s.charAt(4*n+2);
			}
			syi += s.charAt(4*n);
			if(4*n+1 < length) {
				ser += s.charAt(4*n+1);
				if(4*n+2 <length) {
					ser += s.charAt(4*n+2);
					if(4*n+3 < length) {
						syi += s.charAt(4*n+3);
					}
				}
			}
			return syi+ser;
			
			
		}*/
		if(numRows == 2){
			String s1 = "";
			String s2 = "";
			for(int i=0; i<length; i++) {
				if(i%2 == 0) {
					s1 += s.charAt(i);
				} else {
					s2 += s.charAt(i);
				}
			}
			return s1+s2;
		}
		int numColumn = 0;
        
        int count = 0;
        count += numRows;
        String[] sTwo = new String[numRows];
        for(int i=0; i<numRows; i++) {
        	sTwo[i] = "";
        }
        while(count < length) {
        	if(numColumn %2 == 0){			//奇数列给二维数组当前列附numRows个值
        		for(int i=0; i<numRows; i++) {
        			sTwo[i] += s.charAt(count-numRows+i)+"";
        		}
        	}else {							//偶数列给二维数组当前列附numRows-2个值
        		for(int i=numRows-2; i>0; i--){
        			sTwo[i] += s.charAt(count-i)+"";
        		}
        	}
        	numColumn++;
        	if(numColumn%2 == 0) {
        		count += numRows;
        		
        	} else {
        		count += (numRows-2);
        	}
        }
        if(numColumn %2 == 0) {
        	for(int i=0; i<length-count+numRows; i++) {
        		sTwo[i] += s.charAt(count - numRows + i)+"";
        	}
        }else {
        	int temp = length - (count-numRows+2);	//计算还剩下多少个数
        	for(int i=numRows-2; i>numRows-2-temp; i--) {
        		sTwo[i] += s.charAt(count-i)+"";
        	}
        }
        
        //从二维数组中读取
        String ss = "";
        for(int i=0; i<numRows; i++) {
        	ss += sTwo[i];
        }
        return ss;
    }
}
