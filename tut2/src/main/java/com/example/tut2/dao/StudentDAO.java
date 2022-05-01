package com.example.tut2.dao;

import com.example.tut2.dbconnect.DBConnect;
import com.example.tut2.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    Connection connection;

    public StudentDAO() {
        connection = DBConnect.getConnection();
    }
    public List<Student> getStudentList() {
        List<Student> studentsList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double score = resultSet.getDouble("score");
                Student student = new Student(id , name, score);
                studentsList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentsList;
    }
    public void addStudent(Student student){

        try {
            String sql = "INSERT INTO student ( name ;score ) VALUE (?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setDouble(2, student.getScore());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public boolean updateStudent(Student student){
        boolean rowUpdated = false;
        try {
            String sql = "UPDATE student SET name =?, score = ? WHERE id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setDouble(2, student.getScore());
            rowUpdated =ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }
    public boolean deleteStudent (int id){
        boolean rowDeleted = false;
        String sql = "DELETE FROM student WHERE id =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            rowDeleted = ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowDeleted;
    }
}
