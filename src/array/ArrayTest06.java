package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int score[]=new int[3];
		
		Scanner scanner=new Scanner(System.in);
		String s[]= {"국어","영어","수학"};
		
		for(int i=0; i<3; i++){
			System.out.print(s[i]);
			score[i]=scanner.nextInt();
		}
		//System.out.println( Arrays.toString(score) );
		
		//for(int i=0; i<score.length ; i++) {
		//	System.out.println(score[i]);
		//}
		//String s[]= new String[]{"국어","영어","수학"};
		
		
		
//		System.out.println(s[0]+" : " +score[0]);
//		System.out.println(s[1]+" : " +score[1]);
//		System.out.println(s[2]+" : " +score[2]);
		for(int i=0; i<3; i++) {
			System.out.println(s[i]+" : " +score[i]);
		}
		
		

	}

}
