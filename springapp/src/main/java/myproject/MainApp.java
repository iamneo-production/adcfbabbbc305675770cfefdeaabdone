import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the Student bean
        Student student = context.getBean("student", Student.class);

        // Access and print student details
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
    }
}
