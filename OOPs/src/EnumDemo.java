
public class EnumDemo {

    enum Attendance{   //enum is a Special class which contains group of final variables
        Present,
        Absent,
        OnDuty
    }

    public static void main(String[] args) {
        Attendance myStudent = Attendance.OnDuty;

        System.out.println("Status of my Student is: " + myStudent);
    }

}