import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b = 0;  // 시작, 마지막 숫자
		int sum = 0;  // 합계
		System.out.print("시작 숫자: ");
		a = scan.nextInt();
		System.out.print("마지막 숫자: ");
		b = scan.nextInt();
		
		for(int i=a; i<=b; i++) {
			sum += i;   // sum = sum+i;
		}
		System.out.println(a + "부터 "+ b +"까지의 합은 "+ sum);
	}
}
