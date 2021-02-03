/**
 *
 * @author Sukhjot Saggu
 */
package coe318.lab3;
public class Counter {

	public int modul, digi, count;
	public Counter lCounter;

    public Counter(int modulus, Counter left) {
        modul = modulus;
	lCounter = left;
    }

    public int getModulus() {
        return modul;
    }

    public Counter getLeft() {
        return lCounter;
    }

    public int getDigit() {
        return digi;
    }

    public void setDigit(int digit) {
	digi = digit;
    }

    public void increment() {
    	digi = digi + 1;
	if(digi == modul){
		digi = 0;
		if(lCounter != null){
			lCounter.digi++;
		}
	}
    }

    public int getCount() {
	if(lCounter == null){
		count = digi;
	}
	else{
		count = digi + (modul * lCounter.digi);
	}
        return count;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}