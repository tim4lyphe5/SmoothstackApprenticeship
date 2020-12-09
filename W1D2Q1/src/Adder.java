
public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.out.print("The sum of ");
		for(int i=0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
			if(i == args.length - 1) {
				System.out.print(args[i]);
			}else {
				System.out.print(args[i] + " and ");
			}
			
		}
		
		System.out.println(" is " + sum);
		
	}

}
