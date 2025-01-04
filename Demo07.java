import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        String name;
        int age;
        long phno;
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Please enter your name:");
        name = sc.nextLine(); 
        
        System.out.println("Please enter your age:");
        age = sc.nextInt(); 
        
        System.out.println("Please enter your phone number:");
        phno = sc.nextLong(); 
        
       
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phno);
        
        sc.close(); 
    }
}
