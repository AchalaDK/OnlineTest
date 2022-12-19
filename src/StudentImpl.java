import java.sql.*;

public class StudentImpl implements StudentIntrf{
    Connection con;
    @Override
    public void createStudent(Student student) {
        con = DBConnection.createDBConnection();
        String query = "INSERT into studentInfo values(?, ?, ?, ?, ?)";
        try{
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setInt(1, student.getStudentID());
            psmt.setString(2, student.getName());
            psmt.setInt(3, student.getAge());
            psmt.setString(4, student.getAddress());
            psmt.setInt(5, student.getContact());
            int count = psmt.executeUpdate();

            if(count != 0){
                System.out.println("\n Student Successfully added...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void createCourse(Course course) {

    }

    @Override
    public void showAllStudents() {
        con = DBConnection.createDBConnection();
        String query = "SELECT*from studentInfo";
        System.out.format("%s\t%s\t%s\t\t%s\t\t\t%s\n", "StudentID","Name","Age","Address","Contact");
        try{
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while(result.next()){
                System.out.format("%d\t\t\t%s\t\t%d\t\t%s\t\t%d\n",result.getInt(1), result.getString(2), result.getInt(3),
                        result.getString(4), result.getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateStudent(Student student, int id) {
        con = DBConnection.createDBConnection();
        String query = "UPDATE studentInfo SET name = ?, age = ?, address = ?, contact = ? WHERE id = ?";
        try {
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setString(1, student.getName());
            psmt.setInt(2, student.getAge());
            psmt.setString(3, student.getAddress());
            psmt.setInt(4, student.getContact());
            psmt.setInt(5, id);
            int count = psmt.executeUpdate();

            if(count != 0){
                System.out.println("\n Student Successfully updated...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(int id) {
        con = DBConnection.createDBConnection();
        String query = "DELETE from studentInfo WHERE id = ?";
        try {
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setInt(1, id);
            int count = psmt.executeUpdate();

            if(count != 0){
                System.out.println("\n Student Successfully deleted...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
