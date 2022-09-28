package super_keyword;

public class Scooter extends Vehicle{
	int min_mileage=35;
	
	void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Minimum Mileage: "
                           + super.min_mileage);
    }


}

//Driver Program
class Test {
 public static void main(String[] args)
 {
     Scooter A = new Scooter();
     A.display();
 }
}