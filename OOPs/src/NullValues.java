
public class NullValues {
    public static void main(String[] args) {
        String studentsName[] = new String[20];

        System.out.println("Name is : " + studentsName[3]);

        StudentDetails rahul = new StudentDetails();

        rahul.Name();
    }

}

class StudentDetails{
    public String Name = null;

    public void Name() {
        System.out.println("Name is : " + Name);

    }


}