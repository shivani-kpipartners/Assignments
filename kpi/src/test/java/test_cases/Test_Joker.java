package test_cases;

import static org.junit.Assert.assertEquals;

import ques5.Joker;

public class Test_Joker {
public void evaluateExpression() {
		
		Joker a=new Joker();
		String ans=a.Joker("A","Kathak");
		assertEquals("A is dancing Kathak",ans);
		
		Joker b=new Joker();
		String ans2=b.Joker("B","Odissi");
		assertEquals("B is dancing Odissi",ans2);
		
		Joker c=new Joker();
		String ans3=c.Joker("C","Kuchipudi");
		assertEquals("C is dancing Kuchipudi",ans3);
		
		Joker d=new Joker();
		String ans4=d.Joker("D","Manipuri");
		assertEquals("D is dancing Manipuri",ans4);
		
		Joker e=new Joker();
		String ans5=e.Joker("E","Mohiniattam");
		assertEquals("E is dancing Mohiniattam",ans5);
		
		Joker f=new Joker();
		String ans6=f.Joker("F","Lavani");
		assertEquals("F is dancing Lavani",ans6);
		
		Joker g=new Joker();
		String ans7=g.Joker("G","Bharat natyam");
		assertEquals("A is dancing Bharat natyam",ans7);
		
		Joker h=new Joker();
		String ans8=h.Joker("H","Giddha");
		assertEquals("A is dancing Giddha",ans8);
		
}
	
}
