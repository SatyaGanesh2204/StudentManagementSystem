package service;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnection;
import java.sql.ResultSet;
public class StudentManager{
    public void sortById() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from students order by id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department") + ", Marks: " + rs.getDouble("marks"));

            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
    public void sortByName() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from students order by name";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department") + ", Marks: " + rs.getDouble("marks"));

            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void sortByAge() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from students order by age";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department") + ", Marks: " + rs.getDouble("marks"));

            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void sortByDepartment() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from students order by department";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department") + ", Marks: " + rs.getDouble("marks"));

            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void sortByMarks() {
        try{
            Connection con = DBConnection.getConnection();
            String sql = "select * from students order by marks";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("ID:" + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age") + ", Department: " + rs.getString("department") + ", Marks: " + rs.getDouble("marks"));

            }
            rs.close();
            ps.close();
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void addStudentToDatabase(Student student) {
        try{
            Connection con = DBConnection.getConnection();
            String sql="insert into students(id,name,age,department,marks) values (?, ?, ?, ?, ?)";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3,student.getAge());
            ps.setString(4, student.getDepartment());
            ps.setDouble(5, student.getMarks());
            ps.executeUpdate();
            System.out.println("Student Added Successfully.");
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void displayStudentsFromDatabase() {
        try{
        Connection con=DBConnection.getConnection();
        String sql="select * from students";
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            int id=rs.getInt("id");
            String name = rs.getString("name");
            int age=rs.getInt("age");
            String department=rs.getString("department");
            double marks=rs.getDouble("marks");
            System.out.println("ID: " +id);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Department: "+department);
            System.out.println("Marks: "+marks);
            System.out.println("-------------------");
        }
        rs.close();
        ps.close();
        con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void searchStudentById(int id) {
        try{
            Connection con=DBConnection.getConnection();
            String sql = "select * from students where id = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("ID: "+ rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Marks: " + rs.getDouble("marks"));
            }
            else {
                System.out.println("Student Not Found!");
            }
            rs.close();
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void updateStudentInDatabase(Student student) {
        try{
            Connection con = DBConnection.getConnection();
            String sql="update students set name = ?, age=?, department=?,marks=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getDepartment());
            ps.setDouble(4, student.getMarks());
            ps.setInt(5, student.getId());
            int rows=ps.executeUpdate();
            if(rows>0){
                System.out.println("Student Update Successfully.");
            }
            else {
                System.out.println("Student Not Found.");
            }
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudentFromDatabase(int id) {
        try{
            Connection con=DBConnection.getConnection();
            String sql = "delete from students where id=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if(rows > 0){
                System.out.println("Student Deleted Successfully.");
            }
            else System.out.println("Student Not Found.");
            ps.close();
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}