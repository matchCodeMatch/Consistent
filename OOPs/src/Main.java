



class Outer{        //Outer Class
    int Outervalue = 10;

    static class Inner{ // Static Inner Class

        int Innervalue = 29;  //If private is used it shows error..
    }
}

public class Main{
    public static void main(String[] args) {
        // to access inner class first create outer class object and inner class

        Outer myOuter = new Outer();

        Outer.Inner myInner = new Outer.Inner();

        System.out.println(myInner.Innervalue +" "+ myOuter.Outervalue);
    }

}