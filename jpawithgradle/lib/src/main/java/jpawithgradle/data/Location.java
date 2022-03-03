package jpawithgradle.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	private Integer locationId;
	private String city;
	
	public Location() {
		super();
	}
	
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
	
}