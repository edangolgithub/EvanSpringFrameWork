package chandra;

public class Enumtut {
	enum days{		
		sunday(5),monday(3),tue,wed,thur,fri,sat;
		private int value;
	    private days(int value){
	        this.value = value;
	    }
	    private days() {}
	}
	public static void main(String[] args) {
		
		for (days d : days.values()) {
			System.out.println(d.value);
		}
		
		days d= days.sat;
		switch (d) {
		case monday:
		case sunday:	
		case tue:
		case wed:
		case thur:
		case fri:
			System.out.println("go to institute to learn java");
			break;
		case sat:
			System.out.println("sleep untill 10 oclock");
			break;

		default:
			break;
		}

	}

}
