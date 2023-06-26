import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final String path = "InputOutFile/Student/src/Numbers.txt";
    static ArrayList<Animal> animal = new ArrayList<Animal>();
    public static ArrayList<Animal> ReadFile(String path){
       File file = new File(path);
       try{
           FileReader reader = new FileReader(file);
           BufferedReader reader2 = new BufferedReader(reader);
           String line = "";
           while((line= reader2.readLine())!= null){
               Animal animal1= new Animal();
               String [] strings= line.split(",");
               animal1.setId(Integer.parseInt(strings[0]));
               animal1.setName(strings[1]);
               animal.add(animal1);
           }
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        return animal;

    }
    public static int InputInformation1(){
        int newId;
        ArrayList<Integer> test = new ArrayList<Integer>();
         while(true){
             System.out.println("input id: ");
             int id= Integer.parseInt(sc.nextLine());
             for(int i=0; i<animal.size();i++){
                 if((animal.get(i).getId()) == id){
                     test.add(id);
                 }
             }
             if(test.size()>0){
                 System.out.println("trùng id");
                 test.clear();
             }else{
                 return id;
             }
         }
    }
    public static String  InputInformation2() {

        ArrayList<String>demo= new ArrayList<String>();
        while(true) {
            System.out.println("name: ");
            String newName= sc.nextLine();
            for (int i= 0; i < animal.size(); i++) {

                if((animal.get(i).getName()).equals(newName)){
                    demo.add(newName);
                }

            }
            if(demo.size()>0){
                System.out.println("thông tin bị trùng!!");
                demo.clear();
            }else{
                return newName;
            }
        }
    }
    public static ArrayList<Animal> WriteFile(ArrayList<Animal>animal1, String path)  {
        File file = new File(path);
        try {
            FileWriter reader = new FileWriter(file, false);
            BufferedWriter buff = new BufferedWriter(reader);
            for(Animal ch:animal1){
                buff.write(ch.getId()+","+ch.getName());
                buff.newLine();
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animal1;
    }

    public static void main(String[] args) {
        ArrayList<Animal> animal = ReadFile(path);
        System.out.println("danh sách lucs đầu !!");
        for(Animal ch: animal){
            System.out.println(ch);
        }
        int idNew = InputInformation1();
        String newName= InputInformation2();
        Animal newAnimal = new Animal(idNew, newName);
        animal.add(newAnimal);

        ArrayList<Animal> animal1= WriteFile(animal,path);
       for(Animal ch: animal1){
           System.out.println(ch);
       }
    }

}
