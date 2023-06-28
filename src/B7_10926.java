/* 결국 입력받은 문자열에 ??! 라는 문자열을 덧붙여 출력하기만 하면 되기에 문제가 되지는 않는다.
특히나 자바에서는 문자열 연산과 String타입의 출력연산이 매우 편리하다. */

/* -------------------- 방법 1 -------------------- */

// Scanner

import java.util.Scanner;
 
public class B7_10926 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner 객체 생성
		
		String lastString = "??!"; // 출력할 문자열의 마지막 부분 "??!"를 저장하는 변수
		
		String s = in.next(); // 사용자로부터 입력받은 문자열을 변수에 저장합니다.
		System.out.println(s + lastString); // 입력받은 문자열과 마지막 부분을 합쳐서 출력합니다.

        in.close(); // Scanner 사용이 끝났으므로 닫아줍니다.
	}
}

/* 우리가 해야 할 것은 입력받은 문자열에 ??! 문자열을 붙여 출력하는 것이다.
대부분의 언어에서도 문자열 간 덧셈을 하면 문자열을 하나로 연결하여 붙여주는 append 연산을 해주기 때문에 덧셈 연산을 활용하여 출력하면 끝난다. */


/* -------------------- 방법 2 -------------------- */

/* BufferedReader & StringTokenizer */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lastString = "??!";
		
		String s = br.readLine();
		System.out.println(s + lastString);
	}
}
*/