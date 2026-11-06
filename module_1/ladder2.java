package module_1;
import java.util.Scanner;




public class ladder2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float internalMarksForAttendance=0f;
        System.out.println("Enter Attendance percentage :");
        float attendancePercentage = sc.nextFloat();


        if(attendancePercentage>=90) {
            internalMarksForAttendance = 10;
        }
        else {
            // Note: This line is cut off at the edge of the image,
            // but logically divides by 10 to calculate the marks (e.g., 82.35 / 10 = 8.235)
            internalMarksForAttendance = attendancePercentage/10;
        }

        System.out.println("Internal Marks for Attendance: "
                + ""+internalMarksForAttendance);
    }
}
