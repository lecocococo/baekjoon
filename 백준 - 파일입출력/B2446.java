import java.io.*;
import java.util.*;

public class B2446 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int l=2*n-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=2*n;j>=2*i;j--) {
				sb.append('*');
			}
			System.out.println(String.format("%"+l+"s", sb));
			l--;
			sb.setLength(0);
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				sb.append('*');
			}
			System.out.println(String.format("%"+(l+2)+"s", sb));
			l++;
			sb.setLength(0);
		}
	}
}