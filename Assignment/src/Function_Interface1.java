
public interface Function_Interface1 {
	 int calculate(int x);
	}
	  
class Test {
	    public static void main(String args[])
	    {
	        int a = 5;
	  
	        Function_Interface1 s = (int x) -> x * x * x;
	  
	        int ans = s.calculate(a);
	        System.out.println(ans);
	    }
}
