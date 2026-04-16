package com.dj;

import com.dj.thread.NotificationThread;
import com.dj.ui.ConsoleMenu;
import com.dj.util.DBConnection;
import com.dj.util.DBInitializer;

public class App 
{
    public static void main(String[] args )
    {
        if(DBConnection.getConnection()!=null){
            System.out.println("DataBase skeleton is ready");
        }else{
            System.out.println("DataBase connection failed");
        }

        DBInitializer.init();

        NotificationThread notificationLogic = new NotificationThread();
        Thread bgThread = new Thread(notificationLogic);

        bgThread.setDaemon(true);
        bgThread.start();
        
        ConsoleMenu menu = new ConsoleMenu();
        menu.start();
    }
}
