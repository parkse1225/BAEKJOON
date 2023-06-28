/*
불기 연도가 주어질 때 이를 서기 연도로 바꾸어 출력하라는 것이다.
문제속에 답이 있듯, 예제 입력을 보면 1998년생(서기)의 경우 불기로는 2541년생이라는 것이다. 즉, 서기와 불기는 543년 차이가 있음을 알 수 있다.
그러면 불기가 주어졌을 때, 주어진 불기에 543년을 빼준 값. 이 값이 서기가 되는 것이다. */

/* -------------------- 방법 1 -------------------- */

// Scanner

import java.util.Scanner;

public class B8_18108 {
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);    // Scanner 객체 생성
		
		int year = in.nextInt();    // 사용자로부터 연도를 입력받아 저장하는 변수

		System.out.println(year - 543); // 입력받은 연도에서 543을 뺀 값을 출력합니다. (입력받은 불기 연도를 서기 연도로 바꿈)

        in.close(); // Scanner 사용이 끝났으므로 닫아줍니다.
	}
}

/* -------------------- 방법 2 -------------------- */

/* BufferedReader & StringTokenizer */

/* 
입력 방법을 Scanner 대신 BufferedReader 을 사용하여 풀이하는 방법이다.
단, BufferedReader 는 한 줄 단위로 읽은 뒤 문자열로 반환하기 때문에 주어지는 입력에 대한 문자열을 정수로 변환해주는 과정이 필요하다.
이를 위해서는 Integer 클래스의 parseInt()라는 메소드를 사용하면 되는데, 숫자형식의 문자열에 대해 정수형으로 반환해주는 역할을 한다.
 */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();   // 한 줄을 읽고 문자열로 반환함
		int year = Integer.parseInt(s); // 반환 된 문자열을 정수로 바꿔줌
		
		System.out.println(year - 543);
	}
}
*/