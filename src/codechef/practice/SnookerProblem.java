package codechef.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SnookerProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		if(scan.hasNext()){
			int testCases = scan.nextInt();
			int lead = 0;
			int p1c = 0;
			int p2c = 0;
			int flag = 0;
			for(int i=0; i<testCases; i++){
				p1c +=  scan.nextInt();
				p2c +=  scan.nextInt();
				int cuurentLead = Math.abs(p1c-p2c);
				if(cuurentLead>lead){
					lead = cuurentLead;
					if(p1c-p2c<0){
						flag = 2;
					}else {
						flag = 1;
					}
				}
			}
			System.out.println(flag+" "+lead);
		}
	}
}
