import java.util.Scanner;
class Basic_switchcase{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		System.out.println("Please select Gender 1.Male 2.female 3.LGBT");
		int gender = key.nextInt();
		switch(gender){
			case 1: System.out.println("Your Gender is Male");
				break;
			case 2: System.out.println("Your gender is Female");
				break;
			case 3: System.out.println("Your gender is LGBT");
				break;
		}
	}
}
