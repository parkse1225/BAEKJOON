import java.util.Scanner;

public class B2_1000 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // sc 객체명
        int A = sc.nextInt(); // A 입력 받기
        int B = sc.nextInt(); // B 입력 받기

        System.out.println(A+B);

        sc.close();
    }
}

// 방법 2-1
 
/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; // 단순 규칙으로 문자열을 분리해줄 때 필자는 StringTokenizer을 애용한다.

public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," "); // 객체 생성 할 때 StringTokenizer( "문자열" , 구분자 ); 을 해주면 된다.
		int a = Integer.parseInt(st.nextToken()); // 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		int b = Integer.parseInt(st.nextToken()); // 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다. 그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다.
		
		System.out.println(a+b);
	}
} */

/*    
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b); 
        
*/