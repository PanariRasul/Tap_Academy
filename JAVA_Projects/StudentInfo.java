import java.util.Scanner;

class Student {

    private int studentId;
    private String name;
    private float height;
    private String address;

    public Student(int studentId, String name, float height, String address) {
        this.studentId = studentId;
        this.name = name;
        this.height = height;
        this.address = address;
    }

    public Student() {

    }

    //	setter and getter for ID
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    //	setter and getter for Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//	setter and getter for Height
    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

//	setter and getter for Address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}

public class StudentInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//		Student s=null;

        System.out.println("Enter Number of Student: ");
        int n = scan.nextInt();
        scan.nextLine();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            Student s = new Student();

            System.out.println("Enter Student " + (i + 1) + " detainls: ");
            String input = scan.nextLine();
            String[] a = input.split(",");

            int id = Integer.parseInt(a[0]);
            String name = a[1];
            float height = Float.parseFloat(a[2]);
            String address = a[3];

            s.setStudentId(id);
            s.setName(name);
            s.setHeight(height);
            s.setAddress(address);

            arr[i] = s;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student Details ID: " + arr[i].getStudentId() + ", " + "Name: " + arr[i].getName() + ", " + "Height: " + arr[i].getHeight() + ", " + "Address: " + arr[i].getAddress());

        }

    }

}
