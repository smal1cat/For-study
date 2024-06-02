/*메인 + 중간에 풀다가 생각보다 어려워서 포기.풀이 보면서 작성해둔것 올린것이기에
       나중에 다시한번 꼭 풀어볼 것 */
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student str1 = new Student("이름1" ,"2020");
		Student str2 = new Student("기름" ,"2033");
		Student str3 = new Student("보름" ,"2044");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		
		for(Student stu :list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("계속하고 싶으면 y, 종료하고 싶으면 n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu:list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은:" +stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
			}else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}


// Student 클래스
public class Student {

	private String name;
	private String no;
	
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
