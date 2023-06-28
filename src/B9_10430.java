/*
※ 주의할점
1. 입력은 공백단위로 구분 된다.
2. 나머지를 구하는 문제라 변수를 정수형으로 계산한다.

모듈러 연산 (Modular Arithmetic)
이 문제를 풀어보면 알겠지만 컴파일하여 자연수의 어떤 값을 넣어도 1번식과 2번식의 값이 같고, 3번식과 4번식의 값이 같다.
이는 모듈러 연산의 대표적 속성 2가지를 보여주고 있다.
*/

/* -------------------- 방법 1 -------------------- */

// Scanner

import java.util.Scanner;

public class B9_10430 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
 
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
		
		in.close();
	}
}


/* -------------------- 방법 2-1 -------------------- */

/* BufferedReader & StringTokenizer */
/* 반드시 자료형 타입을 잘 보아야 한다.
st.nextToken()은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
(double 형으로 풀면 나머지가 정수로 나와도 소수점까지 같이 출력되어 오답으로 처리된다.) */

/* 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());   // st.nextToken()은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
		int B = Integer.parseInt(st.nextToken());   // st.nextToken()은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
		int C = Integer.parseInt(st.nextToken());   // st.nextToken()은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다.
        
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
	}
}
*/

/*    
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
*/


/* -------------------- 방법 2-1 -------------------- */

/* BufferedReader & split() */
/* br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다. */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" "); // 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
        
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
	}
}
*/


/* -------------------- 추가 방법 -------------------- */

/* BufferedReader & StringBuilder */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		StringBuilder sb = new StringBuilder();
 
		sb.append( (A+B)%C );
		sb.append('\n');
 
		sb.append( (A%C + B%C)%C );
		sb.append('\n');
 
		sb.append( (A*B)%C );
		sb.append('\n');
 
		sb.append( (A%C * B%C)%C );
 
		System.out.println(sb);
	}
}
*/


/* -------------------- 추가 방법 -------------------- */

/* BufferedReader + BufferedWriter */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
        
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write( ((A+B)%C) + "\n" );
		bw.write( ((A%C + B%C)%C) + "\n" );
		bw.write( ((A*B)%C) + "\n" );
		bw.write( ((A%C * B%C)%C) + "\n" );
 
		bw.flush();
		bw.close();
	}
}
*/