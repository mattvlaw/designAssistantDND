import java.util.ArrayList;

public class Orbit {

	ArrayList<Marker> markers;
	String name;
	int max_length;

	public Orbit (String name, ArrayList<Marker> markers, int max_length){
		this.name = name;
		this.markers = markers;
		this.max_length = max_length;
	}

	public ArrayList<String> getIDs() {
		ArrayList<String> IDs = new ArrayList<String>();
		for (int i = 0; i < markers.size(); i++) {
			IDs.add(markers.get(i).getID());
		}
		return IDs;
	}

	public String toString () {
		String rs = "";

		for (Marker e : markers)
			rs = rs + e.getID();	


		return rs.trim();
	}

	public String fancyString() {
		String rs = name + " = [";

		for (Marker e : markers)
			rs = rs + (e.getID() + " ");	

		rs = rs.trim() + "]";
		return rs;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((markers == null) ? 0 : markers.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orbit other = (Orbit) obj;
		if (markers == null) {
			if (other.markers != null)
				return false;
		} else if (!markers.equals(other.markers))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}