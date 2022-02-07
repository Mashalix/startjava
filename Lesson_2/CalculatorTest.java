import java.util.*;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        String answer = "да";
        while(answer.equals("да")) {
            System.out.println("Введите первое число");
            calc.setFirstNumber(sc.nextInt());

            System.out.println("Введите знак математической операции");
            calc.setSign(sc.next().charAt(0));

            System.out.println("Введите второе число");
            calc.setSecondNumber(sc.nextInt());

            calc.calculate();
            System.out.print("Хотите продолжить, да/нет: ");
            answer = sc.next();
        }
    }
}

