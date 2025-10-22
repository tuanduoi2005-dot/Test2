/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.*;

/**
 *
 * @author minhtuan
 */
public class StudentDAO extends DBContext {
    
    private final String GET_STUDENT_SQL = "select * from Student";
    private final String REMOVE_STUDENT_BY_ID_SQL = "DELETE FROM [dbo].[Student]\n" +
"      WHERE StudentID = ?";
    
    public List<Student> DisplayListOfStudent(){
        List<Student> list = new ArrayList<>();
        try{
            PreparedStatement stm = c.prepareStatement(GET_STUDENT_SQL);
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                Student stu = new Student(rs.getString("StudentID"),
                rs.getString("FullName"),
                rs.getString("Gender"),
                rs.getString("DOB"),
                rs.getString("Email"),
                rs.getString("Phone"));
                
            list.add(stu);
            }
        }catch(Exception e){
            return null;
        }
        return list;
    }
    
    public boolean RemoveStudentByID(String StudentID){
        try{
            PreparedStatement stm = c.prepareStatement(REMOVE_STUDENT_BY_ID_SQL);
            stm.setString(1, StudentID);
            int n = stm.executeUpdate();
            if(n != 0){
                return true;
            }
        }catch(Exception e){
            
        }
        return false;
    }
}
