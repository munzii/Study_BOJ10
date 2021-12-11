import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10870 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(f(n)));
		
		br.close();
		bw.flush();
		bw.close();

	}
	
	static int f(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return f(n-1) + f(n-2);
	}

}