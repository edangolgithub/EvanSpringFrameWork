package evan.beans;

import java.util.ArrayList;

public class Listclassbean 
{
	
public Listclassbean(ArrayList<String> countries) {
		super();
		this.countries = countries;
	}

public ArrayList<String> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}

ArrayList<String> countries;

}
