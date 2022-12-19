public class Student {
    private int studentID;
    private String name;
    private int age;
    private String address;
    private int contact;

    public Student() {
    }

    public Student(int studentID, String name, int age, String address, int contact) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
