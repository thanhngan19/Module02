package CaseStudy1.until;

import CaseStudy1.model.Customer;
import CaseStudy1.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CustomerWriteFile {
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Customer.csv";
    public static LinkedList<Customer> WriteFile(LinkedList<Customer> customer){
        File file = new File(path);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            for(Customer ch:customer){
                buff.write(ch.getMkh()+","+ch.getName()+","+ch.getDate()+","+ch.getGender()+","+ch.getCMND()+","+ch.getSDT()+","+ch.getEmail()+","+ch.getLKH()+","+ch.getDC());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
