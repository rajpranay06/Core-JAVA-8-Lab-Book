package hasARelationship;

public class Address {

	String city, state;
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
	public String toString(){
		return " Address [ city : " + city + " state : " + state + " ]"; 
	}
}
