package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
* It is an <em>immutable</em> object.
*
* @author Sukhjot Saggu
*/
public class ComplexNumber {
 double imagine, real;
public ComplexNumber(double re, double im) {
 imagine = im;
real = re;
 }
public double getReal() {
 return real;
 }
public double getImaginary() {
 return imagine;
 }
public ComplexNumber negate() {
 return new ComplexNumber(-real, -imagine);
 }
public ComplexNumber add(ComplexNumber z) {
 return new ComplexNumber(real + z.getReal(), imagine + z.getImaginary());
 }
 public ComplexNumber subtract(ComplexNumber z) {
 return new ComplexNumber(real - z.getReal(), imagine - z.getImaginary());
 }
public ComplexNumber multiply(ComplexNumber z) {
return new ComplexNumber(real * z.getReal() - imagine * z.getImaginary(), real * z.getImaginary() + imagine * z.getReal());
 }
public ComplexNumber reciprocal() {
 ComplexNumber one = new ComplexNumber(real, -imagine);
 ComplexNumber two = one.multiply(new ComplexNumber(real, imagine));
 ComplexNumber three = new ComplexNumber(one.getReal()/two.getReal(), one.getImaginary()/two.getReal());
return three;
 }
 public ComplexNumber divide(ComplexNumber z) {
 ComplexNumber one = new ComplexNumber(real, imagine);
 ComplexNumber two = one.multiply(new ComplexNumber(z.getReal(), -z.getImaginary()));
ComplexNumber three = z.multiply(new ComplexNumber(z.getReal(), -z.getImaginary()));
ComplexNumber four = new ComplexNumber(two.getReal()/three.getReal(), two.getImaginary()/three.getReal());
return four;
 }
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
