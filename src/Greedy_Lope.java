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
		
		Arrays.sort(ropes); // �������� ���� �� �߿��� ���� �ִ� ����(���� ���ſ� ����)�� �ߵ� �� �ִ� ����
		int max = ropes[N-1]; // ������ �̿��Ͽ� �� �� �ִ� �ִ� ����  �ʱⰪ�� ���� ���ſ� ���� ���� ������ ���� �Ѱ� 
		
		for(int i=0;i<N;i++) { //ex) 4 10 15 �� ���� ����  444  15 ���� 10 10 �� ����  ���� �� �ʽᵵ �ȴ� 
			max = Math.max(max, ropes[i]*(N-i));  //��ȣ�� �߿伺 ��ȣ �� ġ�ϱ� ropes[i]*N ���� ����ؼ� ��� ���� 
		}  //The key point is you don't have to use all ropes you can use only the part of the rope 
		
		
		System.out.println(max);
		

	}

}
