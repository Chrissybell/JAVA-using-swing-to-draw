public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int num, int denom) {
        if (denom == 0) {
            System.err.print("This is a division by zero it cannot work.");
        }
        else{
            numerator = num;
            denominator = denom;
        }
    }
    public RationalNumber add(RationalNumber rightFraction) {
        int newNumerator = rightFraction.denominator * numerator + rightFraction.numerator * denominator;
        int newDenominator = denominator * rightFraction.denominator;
        int k = gcd(newNumerator,newDenominator);
        if(k != 1){
            newDenominator = newDenominator / k;
            newNumerator = newNumerator / k;
        }
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber rightFraction) {
        int newNumerator = rightFraction.denominator * numerator - rightFraction.numerator * denominator;
        int newDenominator = denominator * rightFraction.denominator;
        int k = gcd(newNumerator,newDenominator);
        if(k != 1){
            newDenominator = newDenominator / k;
            newNumerator = newNumerator / k;
        }
        return new RationalNumber(newNumerator, newDenominator);
    }
    public RationalNumber multiply(RationalNumber rightFraction) {
        int newNumerator = numerator * rightFraction.numerator;
        int newDenominator = denominator * rightFraction.denominator;
        int k = gcd(newNumerator,newDenominator);
        if(k != 1){
            newDenominator = newDenominator / k;
            newNumerator = newNumerator / k;
        }
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber rightFraction) {
        int newNumerator = numerator * rightFraction.denominator;
        int newDenominator = denominator * rightFraction.numerator;
        int k = gcd(newNumerator,newDenominator);
        if(k != 1){
            newDenominator = newDenominator / k;
            newNumerator = newNumerator / k;
        }
        return new RationalNumber(newNumerator, newDenominator);
    }
    public void reduceFraction(int x, int y) {
        int divisor;
        divisor = gcd(x,y);
        x = numerator / divisor;
        y = denominator / divisor;

        System.out.println("x = " + x + ", y = " + y);
    }

    static int gcd(int a, int b)
    {
        if(a < b){
            int k = a;
            a = b;
            b = k;
        }
        for(int i = b; i > 1; i ++){
            if(a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    public RationalNumber() {
        this(0,1);
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }

}
