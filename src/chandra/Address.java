package chandra;

public class Address {
	int Addressid;
	String street;
	String houseno;
	String City;
	String Country;
	public Address(int addressid, String street, String houseno, String city, String country) {
		super();
		Addressid = addressid;
		this.street = street;
		this.houseno = houseno;
		City = city;
		Country = country;
	}
	public Address()
	{
		
	}
	public int getAddressid() {
		return Addressid;
	}
	public void setAddressid(int addressid) {
		Addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	

}
