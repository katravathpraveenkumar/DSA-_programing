public class oops {
    public static void main(String[]args){
        pen p1=new pen();
        p1.Setcolor("blue");
        p1.Settip(5);
        System.out.println("Pen color: " + p1.color);
        System.out.println("Pen tip: " + p1.tip);
        Student s1=new Student();
        Student s2=new Student();
        s1.name="praveen";
        s2.name="kumar";
        s1.age=30;
        s2.age=25;
        s1.calcupercentage(60,70,80);
        s2.calcupercentage(50,60,70);
        System.out.println("Student 1 percentage: " + s1.percentage);
        System.out.println("Student 2 percentage: " + s2.percentage);
        System.out.println("all are goode students");
    }
    
}
class pen{
    String color;
    int tip;
    void Setcolor(String newcolor){
        color=newcolor;
    }
        void Settip(int newtip){
            tip=newtip;
        }
    
}
class Student{
    String name;
    int age;
    float percentage;
    void calcupercentage(int physics,int chemistry,int maths){
        percentage=(physics+chemistry+maths)/3;
    }

    
}
