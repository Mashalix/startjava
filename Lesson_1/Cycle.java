public class Cycle {

    public static void main(String[] args) {
        
        for(int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int m = -6;
        while(m < 7) {
            System.out.println(m);
            m += 2;
        }

        int sum = 0;
        int j = 10;
        do {
            if(j % 2 == 1) {
                sum = sum + j;
                sum += j;
            }
            j++;
        } while(j < 20);
        System.out.println(sum);
    }
}