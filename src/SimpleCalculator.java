public class SimpleCalculator {
    //11. Sum Calculator
    //Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
    //names firstNumber and secondNumber both of type double.


    private double firstNumber;
    private double SecondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return SecondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.SecondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + SecondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - SecondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * SecondNumber;
    }

    public double getDivisionResult() {
        if (SecondNumber == 0) {
            return this.SecondNumber = 0;
        } else {
            return firstNumber / SecondNumber;
        }
        }

            public static void main(String[]args) {


            SimpleCalculator calculator = new SimpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());
        }

        }

