package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Circle;
import ua.training.view.View;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        View view = new View();
        Controller controller = new Controller(circle, view);
        controller.processUser();
    }
}
