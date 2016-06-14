package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Example05 {

    /**
     * Student:
        -------------
        1> Inputs:
        + RollNo:int
        + FullName:String
        + Age:int
        + Email:String
        + Mark:float
        
        2> Output:
        --> RollNo: ...
        --> FullName: ...
        --> Age: ...
        --> Email: ...
        --> Mark: ... 
     */
    public static void main(String[] args) {
        // 1. Khai báo các biến cần cho xử lý?
        int RollNo;
        String FullName;
        int Age;
        String Email;
        float Mark;

        // 2. Khai báo & khởi tạo đối tượng Scanner để nhận giá trị?
        Scanner doituong = new Scanner(System.in);

        // 3. Nhận giá trị & gán giá trị cho biến?
        System.out.println("- RollNo: ");
        RollNo = doituong.nextInt();

        System.out.println("- FullName: ");
        doituong = new Scanner(System.in);
        FullName = doituong.nextLine();

        System.out.println("- Age: ");
        Age = doituong.nextInt();

        System.out.println("- Email: ");
        doituong = new Scanner(System.in);
        Email = doituong.nextLine();

        System.out.println("- Mark: ");
        Mark = doituong.nextFloat();

        // 4. Hiển thị giá trị của các biến ra ngoài màn hình?
        System.out.println("--> RollNo: " + RollNo);
        System.out.println("--> FullName: " + FullName);
        System.out.println("--> Age: " + Age);
        System.out.println("--> Email: " + Email);
        System.out.println("--> Mark: " + Mark);        
    }
}
