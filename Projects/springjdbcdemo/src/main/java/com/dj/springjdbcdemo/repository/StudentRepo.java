package com.dj.springjdbcdemo.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dj.springjdbcdemo.Model.Student;
import com.dj.springjdbcdemo.Model.StudentDAO;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbc;
    

    public void save(StudentDAO s) {
      String sql = "insert into student (name,marks) values (?,?)";
      int rows = jdbc.update(sql,s.getName(),s.getMarks());
      System.out.println(rows +" effected ");
    }

    public List<Student> findAll(){
       String sql = "select * from student";
     
       return jdbc.query(sql, (ResultSet rs, int rowNum) -> {
            Student s = new Student();
            s.setRollno(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
       });

    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
}
