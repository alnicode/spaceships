package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.enums.MenuEnum;
import java.util.Arrays;

/**
 * The main menu UI.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class MenuUI {

    /**
     * Show the main menu.
     */
    public static void showMenu() {
        var response = 0;

        do {
            response = UtilsUI.numericResponse(menu());

            goTo(response);
        } while (response != 0);
    }

    /**
     * Build the menu through enumeration and loops.
     *
     * @return the main menu.
     */
    private static String menu() {
        final var menu = new StringBuilder();

        menu.append("\nWelcome!\n").append("What do you want to do?\n\n");

        Arrays.stream(MenuEnum.values())
                .forEach(option -> menu.append(option.getOption())
                        .append(". ").append(option.getMessage())
                        .append("\n"));

        return menu.toString();
    }

    private static void goTo(int response) {
        switch (response) {
            case 1:
                RegisterUI.showMenu();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                UtilsUI.close();
                break;
            default:
                System.out.println("\nnot valid\n");
                showMenu();
                break;
        }
    }

}
