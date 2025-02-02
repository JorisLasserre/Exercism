import java.lang.Math;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int armstrongNumber = 0;
        int numDigits = String.valueOf(numberToCheck).length();
        int numberToCheck2 = numberToCheck;
        while (numberToCheck2 > 0) {
            int digit = numberToCheck2 % 10;
            numberToCheck2 = numberToCheck2 / 10;
            armstrongNumber += Math.pow(digit,numDigits);
        }
        return (numberToCheck == armstrongNumber);
    }
    //solution plus propre
    //for (int i = numberToCheck; i > 0; i /= 10) {
    //        armstrongNumber += Math.pow(i % 10, numDigits);
    //    }

}
