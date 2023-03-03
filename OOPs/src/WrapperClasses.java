
//A class that wraps a primitive data type into an object is called wrapper class in java.
public class WrapperClasses {
    public static void main(String[] args) {

        int marks = 75;

        //Boxing - Primitive to Wrapper

        Integer studentMarks = Integer.valueOf(marks);  //Converting int to Integer explicitly

        Integer total = marks; // autoboxing, compiler will write Integer.valueOf() internally


        System.out.println(studentMarks + " " + total);


        //Unboxing - Wrapper to Primitive

        Integer length = Integer.valueOf(15);

        int scaleLength = length.intValue(); //converting Integer to int explicitly

        int totalLength = length; //auto unboxing, now compiler will write length.intValue() internally

        System.out.println(scaleLength + " " + totalLength);




    }
}