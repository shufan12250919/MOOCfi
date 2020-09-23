package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("The num should 0 or positive.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if(setSize < 0 || subsetSize < 0){
            throw new IllegalArgumentException("The argument should be non-negitive");
        }
        if(subsetSize > setSize){
            throw new IllegalArgumentException("The subsetSize should be smaller than setSize");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
