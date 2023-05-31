package ss9_MVC.view;

import ss9_MVC.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController= new StudentController();
        studentController.displayMenu();
    }
}
