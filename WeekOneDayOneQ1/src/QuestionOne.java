
public class QuestionOne {
	
	public static void main(String args[]) {
		QuestionOne q1 = new QuestionOne();
		System.out.println("1)");
		for (int i = 1; i < 5; i++) {
			q1.printStar(i);
			System.out.println();
		}
		q1.printDottedLine(9);	
		System.out.println();
		
		System.out.println("2)");
		q1.printDottedLine(10);
		for (int i = 4; i >0; i--) {
			q1.printStar(i);
			System.out.println();
		}
		System.out.println();
		
	
		int starArray[] = {7,5,3,1};
		System.out.println("3)");
		for (int i = 5; i > 1; i--) {
			q1.printSpace(i);
			q1.printStar(starArray[i-2]);
			System.out.println();
		}
		q1.printDottedLine(11);
		System.out.println();
		
		System.out.println("4)");
		q1.printDottedLine(12);
		for (int i = 2; i < 6; i++) {
			q1.printSpace(i);
			q1.printStar(starArray[i-2]);
			System.out.println();
		}
	}
	
	public void printStar(int stars) {
		for (int i = 0; i < stars; i++) {
			System.out.print("*");		
		}
	}
	
	public void printSpace(int spaces) {
		for (int i = 0; i < spaces; i++) {
			System.out.print(" ");		
		}
	}
	
	public void printDottedLine(int dots) {
		for (int i = 0; i < dots; i++) {
			System.out.print("-");		
		}
		System.out.println();
	}
	
	
	
	
}
