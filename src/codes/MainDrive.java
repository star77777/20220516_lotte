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
        int[] winNumbers=new int[6];
        
        //임시로 로직 확인용 하드코딩
        winNumbers[0]=10;
        winNumbers[1]=15;
        winNumbers[2]=20;
        winNumbers[3]=17;
        winNumbers[4]=33;
        winNumbers[5]=5;
      
        
		//당첨용 랜던으로 작성
        
        
        //몇등인지 맞추는 로직진행
        //당첨번호 확인
        
        int correctCount =0;
        for(int myNum: myNumbers)
        {
        	for(int winNum:winNumbers)
        	{
        		if(myNum ==winNum)
        		{
        		correctCount++;
        	}
        	}
        }
        
        //당첨 등수 확인
        if(correctCount ==6) {
        	System.out.print("축 당첨1등");
        	
        }
        else if(correctCount ==5)
        {
        	System.out.print("축 당첨2등");
        	
        }
        else if(correctCount ==4)
        {
        	System.out.print("축 당첨3등");
        	
        }
        else if(correctCount ==3)
        {
        	System.out.print("축 당첨4등");
        	
        }
        else
        {
        	System.out.print("낙점");
        }
		
		//당첨 등수 확인 /(switch문)
//        switch(correctCount) {
//        case 6:
//        	System.out.print("축 당첨1등");
//        }
	//case 5:
//    	System.out.print("축 당첨2등");
//    }
      //case 4:
//    	System.out.print("축 당첨3등");
//    }
      //case 3:
//    	System.out.print("축 당첨4등");
//    }
      //case 2:
//    	System.out.print("축 당첨5등");
//    }
      //case 1:
//    	System.out.print("축 당첨6등");
//    }
	}
}
