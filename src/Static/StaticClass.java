package Static;

public class StaticClass {
        //static variable
        //method 1
        static int no1 = 10;
        //method 2
        public static int rollNo;
        public static String name;
        public static int marks;
        static {
            name = "GLA University";
        }
        //static block
        static {
            System.out.println("Static Block Demo");
            rollNo = no1;
        }

        public static void main(String[] args) {
            System.out.println("Main method");
            //calling a static member from static method
            System.out.println("no1 = " + no1);
        }

        //static block 2
        static {
            System.out.println("Static Block 2");
        }
}
