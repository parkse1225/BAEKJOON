/* -------------------- 방법 1 -------------------- */

public class B1_2557 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // System.out.println("Hello World!");     - 2번
        // System.out.printf("Hello World!");      - 3번
        // System.out.printf("%s","Hello World!"); - 4번
    }
}


/* -------------------- 방법 2 -------------------- */
/* ★★★★★★★★★★
★★ BufferedReader & BufferedWriter Hello World! ★★
백준 알고리즘을 해결하는데 있어 많이 사용하게 될 방법 중 하나다.
쉽게 비유해서 설명하면  BufferedWriter / BufferedReader는 Buffer에 있는 IO 클래스인데 이 클래스들은 데이터를 하나씩 읽어오는 것이 아니라 임시 공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보내는 방식이다.
즉, 예를 들어 1000개의 데이터를 1개씩 보내는게 아니라 임시로 한 공간에 담아둔 뒤 한 번에 보내는 방법이니 당연 성능면에서 우수하다. */

/*
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Way1_Buffered_WR {
    public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 객체 생성
 
		bw.write("Hello World!"); // 문자열 "Hello World!"를 버퍼에 작성합니다.
		bw.flush(); // 버퍼에 남아있는 데이터를 강제로 출력합니다.
		bw.close(); // 버퍼를 닫고 관련된 시스템 리소스를 해제합니다.
	}
}
*/


/* -------------------- 방법 3 -------------------- */

/* StringBuilder
BufferedWriter와 유사하게 데이터를 모아두었다가 한 번에 출력한다. 특히나 문자열을 조작할 때 매우 유용하다.
특징이 있다면 StringBuilder에서 문자열을 이어 붙인다는 점이다. */

/*
public class Main {
	public static void main(String[] args){
 
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World!");
		
		System.out.println(sb);
	}
}
*/


/* -------------------- 방법 4 -------------------- */

/* 이 방법은 StringBuilder랑 거의 비슷하다! 다만 StringBuilder와 차이점이 있다면 StringBuffer은 동기화를 지원한다는 점.
즉, multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer을 사용해주어야 한다. (StringBuilder은 동기화를 지원하지 않는다.)
아무래도 동기화를 지원하다 보니 StringBuilder 보단 느리지만 그래도 문자열 조작에 있어 String 보다 훨씬 빠르다. */

/*
public class Main {
	public static void main(String[] args){
 
		StringBuffer sb = new StringBuffer();
		sb.append("Hello World!");
		
		System.out.println(sb);
	}
}
*/

/* 대략 속도가 빠른순으로 비교해보자면
BufferedWriter >> StringBuilder > StringBuffer >>>> String */