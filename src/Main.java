
public class Main {
    public static void main (String[] args){
        Person laysa = new Person("Alieza Balles" , 2004);
        Student student= new Student("Alieza Balles", 2004 , "BSIT");
        Instructor instructor= new Instructor("Ma'am Phoebe Sudaria" , 1990 , 30000);
        
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Year of Birth: " + student.getYearOfBirth());
        System.out.println("Major: " + student.getMajor());
        System.out.println( student );
        
        System.out.println("-------------------------------------");
        
        System.out.println("Instructor Information:");
        System.out.println("Name: " + instructor.getName());
        System.out.println("Year of Birth: " + instructor.getYearOfBirth());
        System.out.println("Salary: $" + instructor.getSalary());
        System.out.println(instructor);
    }
}
