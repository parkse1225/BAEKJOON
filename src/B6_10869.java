/* -------------------- 방법 1-1 -------------------- */

/* 주의할 점
1. 입력은 공백으로 구분하여 주어진다.
2. 나눗셈 (A/B) 의 결과는 몫만 반환한다. */

// Scanner

import java.util.Scanner;

public class B6_10869 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
 
        // println = 줄바꿈
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
        
        in.close();
	}
}


/* -------------------- 방법 1-2 -------------------- */

/* 출력 방식을 바꿔서 할 수도 있다.
StringBuilder방식으로 변경해보았다.
StringBuilder을 생성하여 하나의 문자열로 연결 해 준 다음 한번에 출력하는 방법이다. */

/* import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
 
		StringBuilder sb = new StringBuilder();
		sb.append(A+B);
		sb.append('\n');
 
		sb.append(A-B);
		sb.append('\n');
 
		sb.append(A*B);
		sb.append('\n');
 
		sb.append(A/B);
		sb.append('\n');
 
		sb.append(A%B);
 
		System.out.print(sb);

        in.close();
	}
} */


/* -------------------- 방법 1-3 -------------------- */

/* BufferedWriter을 쓰는 방법이다. */

/* import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write((A+B) + "\n");
		bw.write((A-B) + "\n");
		bw.write((A*B) + "\n");
		bw.write((A/B) + "\n");
		bw.write((A%B) + "\n");
 
		bw.flush();
		bw.close();

        in.close();
	}
} */

/* 이렇게 버퍼에 문자열을 담아둔 뒤 한번에 출력하는 방법이 있다.

다만 위와같이 수정하더라도 아래 사진과 같이 시간이 104 ~ 108ms 가 걸린다.
더 단축시키기 위해서는 Scanner입력 방식이 아닌 BufferedReader입력 방식으로 코딩해야한다. */


/* -------------------- 방법 2-1 -------------------- */

/* BufferedReader & StringTokenizer */

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
} */

/*    
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
*/


/* -------------------- 방법 2-2 -------------------- */

/* BufferedReader & split()
br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.
배열에 저장된 원소들은 String 이기 때문에 반드시 int형으로 변환해줘야 한다. */

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
} */