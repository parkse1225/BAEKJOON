public class B1_2557 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // System.out.println("Hello World!");     - 2번
        // System.out.printf("Hello World!");      - 3번
        // System.out.printf("%s","Hello World!"); - 4번
    }
}

// BufferedReader & BufferedWriter Hello World!

/* import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Way1_Buffered_WR {
    public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("Hello World!");
		bw.flush();
		bw.close();
	}
} */