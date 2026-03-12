package annotation_configuration.entity;

import annotation_configuration.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${id}")
    private int id;

    @Value("Khushi")
    private String name;

    private int age;
    private String email;
    private String address;

    public Student() {
        System.out.println("Student bean created");
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    // setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        // setter values
        student.setAge(21);
        student.setEmail("khushi@gmail.com");
        student.setAddress("Noida");

        System.out.println(student);

        context.close();
    }
}