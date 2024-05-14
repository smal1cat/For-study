/* 369문제 */
public static void main(String[] args) {
		
		boolean onepart = false;
		boolean tenpart = false;
		
		
		for(int i=1;i<100;i++) {
			
			int one = i%10;
			int ten = i/10;
			
			onepart = one==3 || one==6 || one==9;
			tenpart = ten==3 || ten==6 || ten==9;
			
			if(onepart && tenpart) {
				System.out.print("짝짝");
			}else if(onepart || tenpart) {
				System.out.print("짝");
			}else {
				System.out.print(i);
			}
			if(i%10==0) {
			System.out.println();
			
		}
	}
}


/* 최빈수 구하기 문제 */
import java.util.Scanner;

public class studying {

	public static void main(String[] args) {
		
		int i =0;
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] plus = new int[10];
		for(i=0;i<arr.length;i++) {
			plus[arr[i]]++;
		} 
		
		int manyNum = 0;
		int Numcount = 0;
		
		for(i=0;i<10;i++) {
			if(Numcount < plus[i]) {
				Numcount = plus[i];
				manyNum = i;
			}
			
		System.out.println("최빈수 :" + manyNum + "나온 횟수 :"+ Numcount);
		}
}
}