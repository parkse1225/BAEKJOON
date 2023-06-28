/* -------------------- 방법 1 -------------------- */

// Scanner

import java.util.Scanner; // Scanner 클래스를 import 한다.

public class B2_1000 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // sc = 객체명 // 객체를 생성한다.
        int A = in.nextInt(); // 정수 A 입력 받기
        int B = in.nextInt(); // 정수 B 입력 받기

        System.out.println(A+B);

        in.close();
    }
}


/* -------------------- 방법 2-1 -------------------- */

// BufferedReader & StringTokenizer

/* -------------------- 설명 -------------------- */

/* read() 메소드는 10 이상의 값을 받고 싶을 때 쓰기가 매우 복잡해진다.
고로 BufferedReader을 쓸 때는 readLine()으로 쓰게 된다.
readLine()은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.

문자열 분리 방법에는 2가지가 있다.
1. StringTokenizer 클래스를 이용하여 분리해주는 방법
2. split() 을 이용하는 방법

※ 결론부터 말하자면 StringTokenizer가 성능면에서 좋다. 그래서 단순 규칙으로 문자열을 분리해줄 때 StringTokenizer을 애용한다. */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;	// 단순 규칙으로 문자열을 분리해줄 때 StringTokenizer을 애용한다.

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();	// readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다. 그래서 특별한 경우가 없는 한 대부분 readLine() 을 쓴다.
		StringTokenizer st = new StringTokenizer(str," ");	// 객체 생성 할 때 StringTokenizer( "문자열" , 구분자 ); 을 해주면 된다.
		int a = Integer.parseInt(st.nextToken());	// 구분된 변수를 꺼낼 때는 차례대로 nextToken(); 을 해주면 문자열을 반환해준다.
		int b = Integer.parseInt(st.nextToken());	// 이때 반환시킨 문자열은 반환됨과 동시에 해당 객체에서 사라지게 된다. 그리고 문자열을 반환했으니 Integer.parseInt()로 int형으로 변환시켜준다.
		
		System.out.println(a+b);
	}
}
*/

/* 굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b); 
*/


/* -------------------- 방법 2-2 -------------------- */

// BufferedReader & split()

/* 두 번째 방법은 br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.
쓰기에는 이 방법이 더 간단하고 보기 편하지만 나중에 문자열을 다루게 되고 데이터 양이 많아지게 되면 StringTokenizer 보다 성능이 낮아 수행시간 차이가 발생하게 된다. */

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(a+b);
	}
}
*/