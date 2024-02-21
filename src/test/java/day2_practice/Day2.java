package day2_practice;

public class Day2 {

    public static void main (String [] args)
    {

//creating class object for addition
        Day2 cal = new Day2();
        cal.addNumbers(3,5);
        cal.divideNumbers(4,2);
        cal.subNumbers(60,15);
        cal.multiplyNumbers(33,2);

//creating class object for addition

    }
    //creating a method for addition
    public void addNumbers (int x, int y)
    {
        int z= x+y;
        System.out.println("Sum of the numbers is:" +z);
    }

    //creating a method for subtraction

    public void subNumbers(int x, int y)
    {
        int z=x-y;
        System.out.println("Difference between the numbers is: " +z);
    }
// creating a method for multiplication

public void multiplyNumbers(int x, int y)
{
    int z= x*y;
    System.out.println("Multiplication Result is: " +z);
}

// creating a method for division

    public void divideNumbers(int x, int y)
    {
        int z= x/y;
        System.out.println("Division Result is: " +z);
    }
}


