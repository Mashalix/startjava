public class Calculator {
    private char sign = '*';
    private int firstNumber;
    private int secondNumber;
    private int result;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

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
                int a = 1;
                for(int i = 0; i < secondNumber; i++) {
                    a *= firstNumber;
                }
                result = a;
                break;
            default:
                System.out.println("Неверно указан тип операции");
                break;
        }
        return result;
    }
}
