import java.util.*;
class Student{
    private String Name;
    private int Physics;
    private int Chemistry;
    private int Mathematics;
    private int English;
    private int Computer;
    //contruction
    public Student(String Name, int Physics, int Chemistry, int Mathematics, int English, int Computer) {
        this.Name = Name;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
        this.Mathematics = Mathematics;
        this.English = English;
        this.Computer = Computer;
    }
     public String getName(){
        return Name;
     }
     public int gettotalmark(){
        return Physics+Chemistry+Mathematics+English+Computer;
     }
     public double getpercantage(){
        return gettotalmark() / 5.0;
     }
     public String getgrade(){
        double per = getpercantage();
        if (per>90) return "A+";
        else if (per>75) return "A";
        else if (per>60) return "B";
        else if (per>45) return "C";
        else return "Fail";
            
        }
        public String iseligibleforiit(){
        if(getpercantage()>75) return "Eligible For IIT";
        else return "Not eligible for IIT";
        }

     }


public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i <n ; i++){
            System.out.println("Enter Student Details"+(i+1));
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter Physics marks");
            int physicsMarks = sc.nextInt();
            System.out.println("Enter Chemistry marks");
            int chemistryMarks = sc.nextInt();
            System.out.println("Enter maths marks");
            int mathsMarks = sc.nextInt();
            System.out.println("Enter english marks");
            int englishMarks = sc.nextInt();
            System.out.println("Enter computer marks");
            int computerMarks = sc.nextInt();
            sc.nextLine();
            students.add(new Student(name, physicsMarks, chemistryMarks, mathsMarks, englishMarks,computerMarks));

        }

        System.out.println("\nEnter Student Name to Search");
        String nameToSearch = sc.next();
        boolean found = false;
        for (Student s : students){
            if (s.getName().equalsIgnoreCase(nameToSearch));
            found = true;
            System.out.println("\nResult for: "+s.getName());
            System.out.println("Total marks: "+s.gettotalmark());
            System.out.println("Percentage: "+s.getpercantage());
            System.out.println("Grade: "+s.getgrade());
            System.out.println("IIT Elig: "+s.iseligibleforiit());
            break;
        }
        if (!found){
            System.out.println("Student Not Found");
        }
        sc.close();



    }
}