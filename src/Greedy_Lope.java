import java.util.Arrays;
import java.util.Scanner;

public class Greedy_Lope {
	
	public static int N;
	public static int ropes[];
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		ropes = new int[N];
		
		for(int i=0;i<N;i++) {
			ropes[i] = in.nextInt();
		}
		
		Arrays.sort(ropes); // 오름차순 정렬 후 중요한 것은 최대 무게(가장 무거운 무게)를 견딜 수 있는 로프
		int max = ropes[N-1]; // 로프를 이용하여 들 수 있는 최대 무게  초기값은 가장 무거운 무게 지탱 가능한 로프 한개 
		
		for(int i=0;i<N;i++) { //ex) 4 10 15 가 예로 좋다  444  15 보다 10 10 이 좋다  로프 다 않써도 된다 
			max = Math.max(max, ropes[i]*(N-i));  //괄호의 중요성 괄호 안 치니까 ropes[i]*N 부터 계산해서 산수 에러 
		}  //The key point is you don't have to use all ropes you can use only the part of the rope 
		
		
		System.out.println(max);
		

	}

}
