import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10872 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int sum = f(n);
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.flush();
		bw.close();
		

	}
	
	public static int f(int n) {
		if(n<=1) return 1;
		return n*f(n-1);
	}

}