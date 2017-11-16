package lab8;

/**
 * Represent an as-yet unevaluated term of a polynomial.
 * A term has-a
 *      coefficient, which is a double
 *      degree, which is an int
 *      
 * Examples:
 * Given the term  3.27 x squared
 *   its coefficient is 3.27
 *   its degree      is 2
 *   
 * Given the term 131
 *    its coefficient is 131.0
 *    its degree      is 0
 * 
 * @author bridget
 *
 */

public class Term {
	
	private final double coef;
	private final int degree;
	
	public Term(double coef, int degree) {
		super();
		this.coef = coef;
		this.degree = degree;
	}

	public double getCoefficient() {
		return coef;
	}

	public int getDegree() {
		return degree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coef);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + degree;
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
		Term other = (Term) obj;
		if (Double.doubleToLongBits(coef) != Double.doubleToLongBits(other.coef))
			return false;
		if (degree != other.degree)
			return false;
		return true;
	}

	public double evaluateTermAtX(double x) {
		double result = 0;
		result = this.coef*Math.pow(x, degree);
		return result;
	}

	@Override
	public String toString() {
		return coef + "x^" + degree;
	}
	
		
	
}