import java.sql.*;

public class DemoJdbc {
    /*
import package
load and register
create connection
create statement
execute statement
process the results
close

commands to execute 

wget https://jdbc.postgresql.org/download/postgresql-42.7.3.jar
javac -cp .:postgresql-42.7.3.jar DemoJdbc.java
java -cp .:postgresql-42.7.3.jar DemoJdbc

*/


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://ep-snowy-bonus-am345dxd-pooler.c-5.us-east-1.aws.neon.tech/neondb?sslmode=require";
        String uname = "neondb_owner";
        String pass = "npg_At6qCp2mRXQJ";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established successfully!");

        Statement stmt = con.createStatement();

        // Create table
        // stmt.execute("CREATE TABLE IF NOT EXISTS students (id SERIAL PRIMARY KEY, name VARCHAR(100), age INT)");
        // System.out.println("Table created!");

        // stmt.execute("INSERT INTO students (name, age) VALUES ('Dhanunjay', 22)");
        // stmt.execute("INSERT INTO students (name, age) VALUES ('Anshika', 25)");
        // stmt.execute("INSERT INTO students (name, age) VALUES ('Ravi', 23)");

        // stmt.execute("INSERT INTO students (name,age) values ('Abhishek', 40)");
        //  System.out.println("Data inserted!");
        
        //update
        // stmt.execute("UPDATE students SET age = 41 WHERE name = 'Abhishek'");
       
       //delete
    //    stmt.execute("DELETE FROM students WHERE name = 'Ravi'"); 

    //using prepared statement
        // String sql = "Insert Into students (name, age) values (?, ?)";
        // PreparedStatement pstmt = con.prepareStatement(sql);
        // pstmt.setString(1, "DJ");
        // pstmt.setInt(2, 23);
        // pstmt.executeUpdate();
        // System.out.println("Data inserted using PreparedStatement!");


        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        System.out.println("\n--- Students----");
        while(rs.next()){
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
        }

        rs.close();
        stmt.close();
        // pstmt.close();
        con.close();
        System.out.println("Connection closed!");
    }
}