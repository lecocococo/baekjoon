import java.io.*;

public class B11726 {
	
	//static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		arr[0] = 1;
		arr[1] = 1;
		
		//arr[3] = 3;
		//arr[4] = 5;
		//arr[5] = 8;
				
		for(int i=2;i<=n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
			//여기서 %연산 안해주면 오버플로우난다
			arr[i] %=10007; 
		}
		System.out.println(arr[n]);
	}
}
