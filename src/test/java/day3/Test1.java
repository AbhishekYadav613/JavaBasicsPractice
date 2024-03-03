package day3;

public class Test1 {
    public static void main(String[] args) {
        Test1 call = new Test1();
        call.printCheck();
        call.calculation();
    }

        public void printCheck ()
        {
            System.out.println("Statement to be printed.");
        }

        public void calculation ()
        {
            int a = 4, b = 6, mul = a * b;

            System.out.println("Multiple is: " + mul);
        }
    }
