public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 25;
        int userNumber = 15;

        System.out.println("Игра началась!");

        while(true) {
            if(userNumber == computerNumber) {
                System.out.println("Вы угадали!");
                break;
            } if(userNumber > computerNumber) {
                System.out.println("Данное число = " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            } if(userNumber < computerNumber) {
                System.out.println("Данное число = " + userNumber + " меньше того, что загадал компьютер");
                //userNumber = userNumber + 1;
                userNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}