package com.dj.springjdbcdemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dj.springjdbcdemo.Model.Student;

@Repository
public class StudentRepo {

    @Autowired
    private JdbcTemplate jdbc;
    

    public void save(Student s) {
      String sql = "insert into student (rollno,name,marks) values (?,?,?)";
      int rows = jdbc.update(sql,s.getRollno(),s.getName(),s.getMarks());
      System.out.println(rows +" effected ");
    }

    public List<Student> findAll(){
       String sql = "select * from student";

    //    RowMapper<Student> mapper = new RowMapper<Student>(){

    //     public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            
    //         Student s = new Student();
    //         s.setRollno(rs.getInt("rollno"));
    //         s.setName(rs.getString("name"));
    //         s.setMarks(rs.getInt("marks"));

    //         return s;
    //     }
        
    //    };

    // using lambda expressions for the funtional interface.
     
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
