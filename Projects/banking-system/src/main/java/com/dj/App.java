package com.dj;

import com.dj.util.DBConnection;
import com.dj.util.DBInitializer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(DBConnection.getConnection()!=null){
            System.out.println("DataBase skeleton is ready");
        }else{
            System.out.println("DataBase connection failed");
        }

        DBInitializer.init();
        System.out.println("Application is running");
    }
}
