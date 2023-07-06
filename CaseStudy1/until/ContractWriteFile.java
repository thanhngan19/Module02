package CaseStudy1.until;

import CaseStudy1.model.Contracts;
import CaseStudy1.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContractWriteFile {
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Contract.csv";
    public static ArrayList<Contracts> WriteFile(ArrayList<Contracts> contracts){
        File file = new File(path);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            for(Contracts ch:contracts){
                buff.write(ch.getMHD()+","+ch.getIdBooking()+","+ch.getFirstMoney()+","+ch.getSum()+","+ch.getMkh());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contracts;
    }
}
