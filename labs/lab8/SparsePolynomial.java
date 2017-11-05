package lab8;

import java.util.HashSet;
import java.util.Set;

import sedgewick.StdDraw;

/**
 * An immutable Polynomial class.  This means that once
 *   the constructor has finished, nothing about this
 *   Polynomial can change.  We check for this in
 *   our testing of your implementation.
 *   
 * Also this implementation is sparse, in the sense
 * that terms with 0 coefficients, supplied or implied,
 * can and should not be represented here.
 * 
 * For example, 5 + x^100 is a Polynomial with a 0-degree
 * term (5) and a 100-degree term (1).   The 99 terms in between are
 * not mentioned here and are implied to have a coefficient of 0.
 * Moreover, x^202 power would also have a coefficient of 0 for this
 * Polynomial.   By using a sparse representation, we retain only
 * the 0-degree and 100-degree terms in this case.
 * 
 * @author yournamehere
 *
 */
public class SparsePolynomial implements Polynomial {

	//
	// TODO Declare instance variable(s)
	//

	/**
	 * Primary constructor
	 * @param array  collection of Terms for this Polynomial.  
	 * Some coefficients may be 0.0, but those Terms should not
	 * be retained in the Set.
	 */
	public SparsePolynomial(Term[] array) {
		// TODO complete this constructor
	}

	/**
	 * This is completed already for you.  Do not change this constructor.
	 * Convenience constructor to create an empty Polynomial.
	 * Calls the primary constructor passing an empty array of Terms.
	 */
	public SparsePolynomial() {
		this(new Term[0]);
	}


	/**
	 * This is provided for you.   
	 * Really, no need to thank me.
	 */
	@Override
	public void plot(double lowx, double highx, double incx) {
		//
		// Determine min and max for y values
		//
		double maxy = this.evaluate(lowx);
		double miny = this.evaluate(lowx);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			maxy = Math.max(maxy, y);
			miny = Math.min(miny, y);
		}
		StdDraw.setXscale(lowx, highx);
		StdDraw.setYscale(miny, maxy);
		for (double x=lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			StdDraw.point(x, y);
		}
	}



}
