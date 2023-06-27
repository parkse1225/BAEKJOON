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

// --------------------- 방법 2-1 --------------------- //
 
/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; // 단순 규칙으로 문자열을 분리해줄 때 필자는 StringTokenizer을 애용한다.

public class Main {
 
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다. 그래서 특별한 경우가 없는 한 대부분 readLine() 을 쓴다.
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," "); // 객체 생성 할 때 StringTokenizer( "문자열" , 구분자 ); 을 해주면 된다.
		int a = Integer.parseInt(st.nextToken()); // 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		int b = Integer.parseInt(st.nextToken()); // 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다. 그리고 문자열을 반환했으니 Integer.parseInt()로 int 형으로 변환시켜준다.
		
		System.out.println(a+b);
	}
} */

// --------------------- 설명 --------------------- //
/* read() 메소드는 10 이상의 값을 받고 싶을 때 쓰기가 매우 복잡해진다.
고로 BufferedReader을 쓸 때는 readLine()으로 쓰게 된다.

readLine()은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.
문자열 분리 방법에는 2가지가 있다.

1. StringTokenizer 클래스를 이용하여 분리해주는 방법
2. split() 을 이용하는 방법

결론부터 말하자면 StringTokenizer가 성능면에서 좋다. 그래서 단순 규칙으로 문자열을 분리해줄 때 StringTokenizer을 애용한다. */


/*
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b); 
        
*/