package exception_handling;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int number[] = new int[10];
            number[10] = 30 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Number can not be divided by zero");
        }
        }
    }
	


