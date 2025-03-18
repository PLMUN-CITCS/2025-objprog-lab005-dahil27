public class MathLibraryDemo {
    public static void main(String[] args) {
    	double base = 2;
    	int exponent = 3;
    	double numberForSqrt = 16;
    	double decimalNumber = 5.67;
    	double powerResult = Math.pow(base, exponent);
    	double sqrtResult = Math.sqrt(numberForSqrt);
    	long roundedNumber = Math.round(decimalNumber);
    	double randomNumber = Math.random();
    	
    System.out.println("Power: " + powerResult);
   	System.out.println("Square Root: " + sqrtResult);
   	System.out.println("Rounded Number: " + roundedNumber);
   	System.out.println("Random Number: " + randomNumber);
    }
}