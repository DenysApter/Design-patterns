package fabricMethod;

import fabricMethod.dialogs.Dialog;
import fabricMethod.dialogs.HtmlDialog;
import fabricMethod.dialogs.WindowsDialog;


public class Main {

    private static Dialog dialog;


    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }



    static void configure() {
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
