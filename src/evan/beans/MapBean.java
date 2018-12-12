package evan.beans;

import java.util.Map;

public class MapBean {
	int id;
	Map<String, String> Dictionary;

	public MapBean(int id, Map<String, String> dictionary) {
		super();
		this.id = id;
		Dictionary = dictionary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String> getDictionary() {
		return Dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		Dictionary = dictionary;
	}

}
