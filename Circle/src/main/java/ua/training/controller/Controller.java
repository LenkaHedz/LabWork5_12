package ua.training.controller;

import ua.training.view.View;

import java.util.Scanner;

import ua.training.model.Circle;

public class Controller {
    private Circle circle;
    private View view;

    public Controller(Circle circle, View view) {
        this.circle  = circle;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        while (!circle.checkRadius(inputRadiusWithScanner(sc))){}
        view.printMessage(circle.toString());
    }

    private double inputRadiusWithScanner(Scanner sc) {
        double res=0;
        view.printRadiusInput();

        while( true ) {
            while (!sc.hasNextDouble()) {
                view.printNotDoubleInput();
                sc.next();
            }
            if ((res = sc.nextDouble()) <= 0) {
                view.printWrongRadiusInput();
            }
            break;
        }
        return res;
    }
}
