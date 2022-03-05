package demo.readingconfiguration;

public class Person {
	
	private Long adharCardNumber;
	private String personName;
	private Address residentialAddress;
	private Address permanentAddress;
	
	public Long getAdharCardNumber() {
		return adharCardNumber;
	}
	public void setAdharCardNumber(Long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


}
