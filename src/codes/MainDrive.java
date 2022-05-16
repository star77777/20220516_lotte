package codes;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
	
        Scanner myScanner = new Scanner(System.in );
		
        int[] myNumbers = new int[6];
        
        for(int i=0; i<6; i++)
        {
        	while(true) {
        	System.out.print((i+1)+"번째 숫자: ");
        	int inputNum =myScanner.nextInt();
        	
        	
        	boolean isRangeok =1<= inputNum&&inputNum<=45;
        	
        	boolean isReapeat =false;
        	
        	for(int  num:myNumbers)
        	{
        		if(num== inputNum) {
        			isReapeat=true;
        		}
        	}
        	if(isRangeok)
        		
        	{
        		myNumbers[i] =inputNum;
        		break;
        	}
        	}
        	}	
        
        
		
		
	}
}
