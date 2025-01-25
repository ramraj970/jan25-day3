import java.util.Scanner;

public class FindMaxOrMin {
 public static void main(String[] args) {
		int[] num;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		size = sc.nextInt();
		num = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter"+(i+1)+"Element");
			int n = sc.nextInt();
			num[i]= n;
		}
		int max = num[0];
		int min = num[0];
		for(int i=1;i<size;i++) {
			if(num[i] > max) {
				max = num[i];
			}
			if(num[i] < min) {
				min = num[i];
			
		}
	}
System.out.println("max---->"+max);
System.out.println("min---->"+min);
 }
}
