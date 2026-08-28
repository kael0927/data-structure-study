import java.util.Scanner;
public class day4{
    public static void main(String[] args){
        // String s = "hello";
        // String t = s;
        // s = "world";
        // System.out.print(t);
        //Scanner scanner = new Scanner(System.in);//创建对象
        //System.out.print("input your name:");
        //String name = scanner.nextLine();//读取一行输入并获取字符串
        //System.out.print("input your age:");
        //int age = scanner.nextInt();
        //System.out.printf("hi,%s,you are %d\n",name,age);
        // 条件判断
        
        // yield
        
       
        // TODO: 给Person增加构造方法:
        //Person ming = new Person("小明", 12);
        //System.out.println(ming.getName());
        //System.out.println(ming.getAge());
        Person p = new Student();
        p.run(); // 应该打印Person.run还是Student.run?
    }
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
   
        

       //class Person {
       //    private String name;
       //    private int age;

       //    public Person(String name,int age){
       //        this.name = name;
       //        this.age = age;
       //    }
       //    public String getName() {
       //        return name;
       //    }

       //    public int getAge() {
       //        return age;
       //    }
       //}
        
            
        


