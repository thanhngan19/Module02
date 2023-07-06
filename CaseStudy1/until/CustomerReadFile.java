package CaseStudy1.until;

import CaseStudy1.model.Customer;


import java.io.*;

import java.util.LinkedList;

public class CustomerReadFile {
    static LinkedList<Customer> Customer1 = new LinkedList<>();
    private static final String path= "E:\\New Volume\\codegym\\Module02\\CaseStudy1\\data\\Customer.csv";
    public static LinkedList<Customer> ReadFile() {
        File file = new File(path);
        BufferedReader bufferedReader;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    Customer customer=new Customer();
                    customer.setMkh(Integer.parseInt(strings[0]));
                    customer.setName(strings[1]);
                    customer.setDate(strings[2]);
                    customer.setGender(strings[3]);
                    customer.setCMND(strings[4]);
                    customer.setSDT(strings[5]);
                    customer.setEmail(strings[6]);
                    customer.setLKH(strings[7]);
                    customer.setDC(strings[8]);
                    Customer1.add(customer);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Customer1;

    }}
