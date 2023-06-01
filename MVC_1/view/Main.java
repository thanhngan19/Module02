package MVC_1.view;

import MVC_1.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }

}
