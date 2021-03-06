package day7;

import java.util.Objects;

public class Vehicles implements Comparable<Vehicles>{
	
	int id;
	String name;
	
	public Vehicles() {
		
	}
	public Vehicles(int id, String name) {
		this.id = id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicles other = (Vehicles) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	// Sorting based on Id
//	@Override
//	public int compareTo(Vehicles obj) {
//		if(this.id>obj.id) {
//			return 1;
//		} else if(this.id<obj.id) {
//			return -1;
//		} else {
//			return 0;
//		}
//  }
	

	// Sorting based on name - Asc
	@Override
	public int compareTo(Vehicles obj) {
		return this.name.compareTo(obj.name); 
	}
	
//	// Sorting based on name - desc
//	@Override
//	public int compareTo(Vehicles obj) {
//		return obj.name.compareTo(this.name);
//											   
//	}
}
