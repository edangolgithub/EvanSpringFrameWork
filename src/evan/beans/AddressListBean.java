package evan.beans;

import java.util.ArrayList;

public class AddressListBean {
	int id;
	ArrayList<Address> addresses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

	public AddressListBean(int id, ArrayList<Address> addresses) {
		super();
		this.id = id;
		this.addresses = addresses;
	}
}
