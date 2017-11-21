package lab8;

import java.lang.reflect.Array;
import java.util.Arrays;
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
 * @author bridget
 *
 */
public class SparsePolynomial implements Polynomial {

	private final Set<Term> poly;

	/**
	 * Primary constructor
	 * @param array  collection of Terms for this Polynomial.  
	 * Some coefficients may be 0.0, but those Terms should not
	 * be retained in the Set.
	 */
	public SparsePolynomial(Term[] array) {
		poly = new HashSet<Term>();

		for(int i=0; i < array.length; ++i) {
			for (int j=0; j < array.length; ++j) {
				if(array[i].getDegree() == array[j].getDegree() && !array[i].equals(array[j])){
					double coef = array[i].getCoefficient() + array[j].getCoefficient();
					array[i] = new Term(coef, array[i].getDegree());
					array[j] = null;
				}
			}
		}

		for (int i=0; i < array.length; ++i) {
			if (array[i].getCoefficient() != 0) {
				Term ti = new Term(array[i].getCoefficient(), array[i].getDegree());
				poly.add(ti);
				//poly.add(array[i]);
			}
		}
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((poly == null) ? 0 : poly.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparsePolynomial other = (SparsePolynomial) obj;
		if (poly == null) {
			if (other.poly != null)
				return false;
		} else if (!poly.equals(other.poly))
			return false;
		return true;
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

	/**
	 * return the highest degree
	 */
	public int degree() {
		int max = 0;
		for (Term i : poly) {
			int result = i.getDegree();
			if (max < result) {
				max = result;
			}
		}
		return max;
	}

	/**
	 * return coef at degree
	 */
	public double getCoefficientAtDegree(int degree) {
		double coef = 0;
		for(Term i : poly) {
			if(i.getDegree() == degree) {
				coef = i.getCoefficient();
			}
		}
		return coef;
	}

	/**
	 * returns an array that is the dense form of the polynomial
	 */
	public Term[] toArray() {
		Term array[] = new Term[(degree()+1)];

		for(Term t : poly) {
			if(array[t.getDegree()] == null) {
				array[t.getDegree()] = t;
			}
			else {
				double c = t.getCoefficient() + array[t.getDegree()].getCoefficient();
				array[t.getDegree()] = new Term(c, t.getDegree());
			}
			

		}
		
		for(int i=0; i < array.length; ++i) {
			if(array[i] == null) {
				array[i] = new Term(0, i);
			}
		}
		return array;
	}


	@Override
	/**
	 * evaluate the polynomial at x
	 */
	public double evaluate(double x) {
		double result = 0;
		for (Term i : poly) {
			result = result + i.evaluateTermAtX(x);
		}
		return result;
	}

	/**
	 * returns a new polynomial that is the sum of the two
	 */
	public Polynomial sum(Polynomial other) {
		Term[] thisP = this.toArray();		
		Term[] otherP = other.toArray();

		if (thisP.length > otherP.length) {
			Term[] ans = thisP;
			for(int i=0; i < otherP.length; ++i) {
				double c = otherP[i].getCoefficient() + thisP[i].getCoefficient();
				ans[i] = new Term(c, thisP[i].getDegree());
			}
			Polynomial sum = new SparsePolynomial(ans);
			return sum;
		}
		
		else { // when otherP's length is greater or equal to thisP's length
			Term[] ans = otherP;
			for(int i=0; i < thisP.length; ++i){
			//	thisP[i].getCoefficient();
				//otherP[i].getCoefficient();
				double c = thisP[i].getCoefficient() + otherP[i].getCoefficient();
				ans[i] = new Term(c, otherP[i].getDegree());
			}
			Polynomial sum = new SparsePolynomial(ans);
			return sum;
		}
	}


	/**
	 * takes the derivative of the polynomial
	 */
	public Polynomial derivative() {
		Term[] r = this.toArray();
		Term[] df = new Term[r.length];
		for (Term j : r) {
			df[j.getDegree()] = new Term((j.getCoefficient()*j.getDegree()), (j.getDegree()-1));
		}
		Polynomial ans = new SparsePolynomial(df);
		return ans;
	}

	/**
	 * insert a term t to the polynomial
	 */
	public Polynomial addTerm(Term t) {
		Term[] ans = {t};
		SparsePolynomial result = new SparsePolynomial(ans);
		Polynomial end = sum(result);
		return end;
	}

	/**
	 * toString of the polynomial
	 */
	public String toString() {
		return "SparsePolynomial [poly=" + poly + "]";
	}




}
