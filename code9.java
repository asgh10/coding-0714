import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in, "UTF-8");
        String[] students = new String[5];

        for(int i = 0; i < students.length; i++){
            System.out.print((i+1)+"번째 학생: ");
            students[i] = sc.nextLine();
        }

        System.out.println("====학생명단====");

        for(int i = 0; i < students.length; i++){
            System.out.printf("%02d %s%n", (i+1), students[i]);
        }
    }
}
