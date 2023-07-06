package CaseStudy1.until;

import CaseStudy1.model.Contracts;
import CaseStudy1.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class ContractReadFile {
    static ArrayList<Contracts> Contracts = new ArrayList<>();
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Contract.csv";
    public static ArrayList<Contracts> ReadFile(){
        File file = new File(path);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line=bufferedReader.readLine())!=null){

                    String [] strings = line.split(",");
                    Contracts contracts = new Contracts();
                    contracts.setMHD(Integer.parseInt(strings[0]));
                    contracts.setIdBooking(Integer.parseInt(strings[1]));
                    contracts.setFirstMoney(Double.parseDouble(strings[2]));
                    contracts.setSum(Double.parseDouble(strings[3]));
                    contracts.setMkh(Integer.parseInt(strings[4]));
                    Contracts.add(contracts);
                }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Contracts;
    }

}
