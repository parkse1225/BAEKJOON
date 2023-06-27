/* -------------------- 방법 1 -------------------- */

import java.util.Scanner;

public class B5_1008 {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
		
        // 문제에 나와있듯이 오차 범위를 벗어나지 않게 하기 위해서는 반드시 double형(실수형)으로 출력을 해주어야 한다.
		double a=in.nextDouble();
		double b=in.nextDouble();

		System.out.print(a/b);

        in.close();
	}
}


/* -------------------- 방법 2-1 -------------------- */

/* BufferedReader 을 쓰는 방식이다. */

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		System.out.println(a/b);
	}
} */

/*    
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		System.out.println(a/b);
*/


/* -------------------- 방법 2-2 -------------------- */

/* br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.
그렇게 저장된 배열 원소를 하나씩 꺼내 double형으로 변환해주어야 한다. */

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		
		System.out.println(a/b);
	}
} */