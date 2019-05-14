package chandra;

public class StudentMain {

	public static void main(String[] args) {

		StudentManager manger = new StudentManager();
		Student s = new Student();
		Semester sm = new Semester();
		Faculty f = new Faculty();
		s.id = 1;
		s.name = "ram";

		Address ad = new Address();
		ad.Addressid = 1;
		ad.City = "lncob";
		s.Address=ad;

		manger.Student = s;
		manger.semeseter = sm;
		manger.faculty = f;
		
		manger.showinf();
		

	}

}
