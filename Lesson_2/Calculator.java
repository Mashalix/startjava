public class Calculator {
    private char sign = '*';
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }
    private int result;

    public int calculate() {

        switch (sign) {
            case '+':
                result = firstNumber + secondNumber;
            break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                for(int i = 0; i < secondNumber; i++) {
                }
                result = 1;
                break;
            default:
                System.out.println("Неверно указан тип операции");
                break;
        }
        return result;
    }
}
