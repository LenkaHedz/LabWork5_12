package ua.training.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua"));  // Ukrainian
                    new Locale("en"));        // English

    // Text's constants
    public static final String INPUT_RADIUS_DATA = "input.radius.data";
    public static final String INPUT_WRONG_RADIUS = "input.wrongradius.data";
    public static final String INPUT_NOT_DOUBLE_RADIUS = "input.notdouble.data";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printRadiusInput() {
        printMessage(bundle.getString(INPUT_RADIUS_DATA));
    }

    public void printNotDoubleInput() {
        printMessage(bundle.getString(INPUT_NOT_DOUBLE_RADIUS));
    }

    public void printWrongRadiusInput() {
        printMessage(bundle.getString(INPUT_WRONG_RADIUS));
    }

}