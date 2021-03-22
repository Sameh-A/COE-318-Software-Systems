package coe318.lab2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Sameh Ahmed 
 * 500907041
 */
public class ComplexNumber {
  //Instance variable declarations
private double real;
private double imaginary;
  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
  public ComplexNumber(double re, double im) {
      //Initialize the instance variables000
      real = re;
     imaginary = im;
     
   }

  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return real;  //A stub: to be fixed
  }

  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return imaginary;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is <b>NOT</b>
   * modified.
   * @return -this
   */
  public ComplexNumber negate() {
      ComplexNumber negate = new ComplexNumber(real,imaginary);
      negate.real=-1*real;
      negate.imaginary=-1*imaginary;
      return (negate);
  }

  /**
   * Returns a new ComplexNumber that is the
   * sum of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber add(ComplexNumber z) {
       ComplexNumber add = new ComplexNumber(real,imaginary);
      add.real=add.real+z.real;
      add.imaginary=z.imaginary + add.imaginary;
      return (add);  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber that is the
   * difference of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber subtract(ComplexNumber z) {
    ComplexNumber subtract = new ComplexNumber(real,imaginary);
    subtract.imaginary=subtract.imaginary-z.imaginary;
    subtract.real=subtract.real-z.real;
      return (subtract);
  }

  /**
   * Returns a new ComplexNumber that is the
   * product of <em>this</em> and <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this * z
   */
  public ComplexNumber multiply(ComplexNumber z) {
     ComplexNumber multiply = new ComplexNumber(real,imaginary);
      ComplexNumber product = new ComplexNumber(real,imaginary);
    multiply.imaginary=(multiply.real* z.imaginary)+(multiply.imaginary*z.real);
    multiply.real=(multiply.real*z.real)+(-product.imaginary*z.imaginary);
      return (multiply);
      
  }

  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of <em>this</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
     ComplexNumber x = new ComplexNumber(real,-imaginary);
     ComplexNumber y = new ComplexNumber(real,imaginary);
     y = x.multiply(y);
     ComplexNumber reciprocal = new ComplexNumber(x.getReal()/y.getReal(),x.getImaginary()/y.getReal());
     return reciprocal;
       //A stub: to be fixed
  }
  

  /**
   * Returns a new ComplexNumber that is
   * <em>this</em> divided by <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
     ComplexNumber x = new ComplexNumber (real,imaginary);
     ComplexNumber y = new ComplexNumber(z.real,-z.imaginary);
     ComplexNumber Reciprocal = new ComplexNumber(z.real,-z.imaginary);
      y = x.multiply(y);
      Reciprocal = z.multiply(Reciprocal);
      ComplexNumber Recip = new ComplexNumber(y.real/Reciprocal.real,y.imaginary/Reciprocal.real);
  
  
      return Recip;  //A stub: to be fixed
  }

  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   * and imaginary parts depending on the
   * the sign of the imaginary part.
   * <p>
   * Examples:
   * <pre>
   *  ..println(new ComplexNumber(0,0); -> "0.0"
   *  ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
   *  ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
   * </pre>
   * @return the String representation.
   */
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}