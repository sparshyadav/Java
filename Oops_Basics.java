public class Oops_Basics {
    public static class Student{
        String name;
        int rollNo;
        double percentage;
    }
    public static void main(String[] args) {
        Student Sparsh = new Student();  //Declaration
        Sparsh.name = "Sparsh";  //Initialization
        Sparsh.rollNo = 1383;
        Sparsh.percentage = 9.3;     

        Student Shreya = new Student();
        Shreya.name ="Shreya";
        Shreya.rollNo = 1421;
        Shreya.percentage = 9.4;

        System.out.println(Sparsh.name);
        System.out.println(Sparsh.rollNo);
        System.out.println(Sparsh.percentage);

        System.out.println(Shreya.name);
        System.out.println(Shreya.rollNo);
        System.out.println(Shreya.percentage);
    }
}
