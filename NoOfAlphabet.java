
public class NoOfAlphabet {

	public static void main(String[] args) {
		for(int i=630,k=0,m=0;i>=500;i++) {
			int num = i;
			int counter =0;
			for(int p=1;p<=num;p++) {
				if(num % p == 0) counter++;
			}
			if(counter == 2) {
				System.out.println("Last prime number...."+num);
				break;
			} //if counter
			
		} // for i
	}

}
