package com.alnicode.spaceships.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The main menu UI.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Component
public class MenuUI {

    @Autowired
    private UtilsUI utilsUI;

    /**
     * Show the main menu.
     */
    public void showMenu() {
        var response = 0;

        do {
            response = utilsUI.numericResponse("\n" +
                    "Welcome!\n" +
                    "What do you want to do?\n\n" +
                    "1. Register inventories and spaceships.\n" +
                    "2. Search or consult inventories and spaceships.\n" +
                    "3. Exit.\n"
            );

            goTo(response);
        } while (response != 0);
    }

    private void goTo(int response) {
        switch (response) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                utilsUI.close();
                break;
            default:
                System.out.println("\nnot valid\n");
                showMenu();
                break;
        }
    }

}
