public class ConditionalStatement {

    public static void main(String[] args) {
        
        int age = 25;
        if(age > 20) {
            System.out.println("adult");
        }

        boolean male = true;
        if(male) {
            System.out.println("this is a man");
        }
        if(!male) {
            System.out.println("this is a woman");
        }

        double height = 1.50;
        if(height < 1.80) {
            System.out.println("midle height");
        } else {
            System.out.println("tall");
        }

        char firstLatterName = 'T';
        if(firstLatterName == 'M') {
            System.out.println("Maria");
        } else if(firstLatterName == 'I') {
            System.out.println("Igor");
        } else {
            System.out.println("not found");
        }
    }
}
