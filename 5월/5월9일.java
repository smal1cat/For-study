//임의 숫자로 나타내는 구구단 문제
import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("시작s,f단까지");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시작s 입력 : ");
		String i = scan.nextLine();
		System.out.print("끝f  입력 :");
		String j = scan.nextLine();
		System.out.print("\n");
		int i2 = Integer.parseInt(i); 
		int j2 = Integer.parseInt(j);
		
		for(int i1=i2;i1<=j2;i1++) {
			for(int j1=1;j1<=9;j1++) {
				sum = i1*j1;
				
				System.out.println(i1+"*"+j1+"="+sum);
			}
		}
	}

}


//달팽이 숫자 만들기 참고용. 풀이가 좀 다양한데 그나마 내가 이해하기 쉬운것으로
//갖어왔다. 나중에 다시 연습해서 풀어볼 것!!
import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        int[] dy={1,0,-1,0};
        int[] dx={0,1,0,-1}; 
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num=1;
            int x=0,y=0,dir=0;
            int n=sc.nextInt();
            int map [][] =new int[n][n];
            while(num<=(n*n)){
                map[x][y]=num++; //하나씩 증가시키기 이제 상하좌우로 이동 먼저 오른쪽에서 왼쪽으로 
                x+=dx[dir];
                y+=dy[dir];
                if(x>n-1||x<0|| y > n-1 || y < 0 || map[x][y] != 0){ //범위 밖이거나 값이 저장되었을 경우 방향을 바꿔준다.
                    x-=dx[dir]; //왔던거 되돌아 가주고
                    y-=dy[dir];
                    dir=(dir+1)%4; // 방향 체인지
                    x+=dx[dir];     // 방향으로 이동
                    y+=dy[dir];              
                }              
            }
            System.out.println("#"+test_case);
         for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}