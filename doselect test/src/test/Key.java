package test;

import java.util.Objects;

public class Key {

	int index;
	String name;

	public static void main(String[] args) {
		
	}

	public Key(int index, String name) {
		super();
		this.index = index;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return index == other.index && Objects.equals(name, other.name);
	}

}
