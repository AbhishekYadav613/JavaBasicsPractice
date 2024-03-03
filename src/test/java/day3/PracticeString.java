package day3;

public class PracticeString {
    public static void main(String[] args) {
        PracticeString abc= new PracticeString();
        abc.sample();
        abc.sample1();

    }

    public void sample(){
        String a= "Abhishek";

        System.out.println("No. of characters in name: " +a.length());
        System.out.println("Name in uppercase:" +a.toUpperCase());
        System.out.println("Alphabet at third place is:" +a.charAt(2));
    }

    public void sample1 (){
        String b= "QweRty@123";
        System.out.println("Name in lower case: " +b.toLowerCase());
        System.out.println(b.equals("Qwerty@123"));
        System.out.println(b.contains("Rty"));
    }
}
