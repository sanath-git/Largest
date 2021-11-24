import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNo = in.nextInt();
        System.out.println("enter the second number");
        int secondNo = in.nextInt();
        System.out.println("enter the third number");
        int thirdNo = in.nextInt();

        if(firstNo > secondNo)
        {
            if(firstNo > thirdNo)
            {
                System.out.println(firstNo + " is the greatest");
            }else
            {
                System.out.println(thirdNo + " is the greatest");
            }
        }else if(secondNo > thirdNo)
        {
            System.out.println(secondNo + " is the greatest");
        }else {
            System.out.println(thirdNo+" is the greatest");
        }
    }
}
