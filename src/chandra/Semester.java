package chandra;
enum semenum{
	I,II,III,IV
}
public class Semester {
    int semid;
	semenum sem=semenum.I;
	double durationinmnths;
	public Semester(int semid, semenum s, double durationinmnths) {
		super();
		this.semid = semid;
		this.sem = s;
		this.durationinmnths = durationinmnths;
	}
	
	
}
