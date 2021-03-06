package org.misc;

/**
 * Questions:
 * 1. Can final int and final Integer be modified? No
 * 2. Is Integer immutable like String? Yes
 * 
 * @author octopusgarden
 */
public class JavaFinal {

	public void finalKeywordsTest() {
		final int x = 1;
		// x = 2; Won't compile
		System.out.println("x=" + x);

		final Integer y = 1;
		// y = 2; Won't compile
		System.out.println("y=" + y);

		this.finalKeywordsVarModify(x);
		System.out.println("x=" + x);
	}

	public void finalKeywordsVarModify(Integer x) {
		x = 2;
		System.out.println("Inside x=" + x);
	}
}
