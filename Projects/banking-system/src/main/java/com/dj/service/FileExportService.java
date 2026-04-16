package com.dj.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.dj.model.Transaction;

public class FileExportService {
    public String exportTrasactions (String username, List<Transaction> transactions)throws IOException{
        
        String fileName = username + "_statement.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write ("===================== DJ BANK OFFICIAL STATEMNT =========== \n");
            writer.write("User :" + username.toUpperCase()+ "\n");
            writer.write("Total Transactions: "+ transactions.size() +"\n");
            writer.write("-----------------------------------------------\n\n");

            for(Transaction t: transactions){
                writer.write(t.toString()+"\n");
            }
            writer.write("\n------------------------------------------------------\n");
            writer.write("End of Statment. Thank your for banking with DJ");
        }
        return fileName;
    }
}
