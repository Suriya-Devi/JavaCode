package assignments;



class Teacher{
	void java() {
		
	}
}
class Mentor extends Teacher{
	void selenium() {
		
	}
}
class Experience_Student extends Mentor {
	void apitesting() {
		
	}
}
public class Ass_Upcasting_Downcasting_Class extends Experience_Student {
	void sql() {
		
	}

	public static void main(String[] args) {
		Mentor m2=	new Experience_Student();
		m2.java();
		m2.selenium();
		Experience_Student e1=new Ass_Upcasting_Downcasting_Class();//Once upcasting is done,
		//then only we can do downcasting
		e1.apitesting();
		e1.java();
		e1.selenium();
		
		Ass_Upcasting_Downcasting_Class s1=(Ass_Upcasting_Downcasting_Class)e1;//downcasting
		s1.sql();
		s1.apitesting();
		s1.java();
		s1.selenium();

	}

}
