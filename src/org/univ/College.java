package org.univ;

public class College extends University{
	
	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();

}

	@Override
	public void ug() {
		System.out.println("Overrided");
	}

	@Override
	public void pg() {
		System.out.println("PG overrided");
	}
	
}
