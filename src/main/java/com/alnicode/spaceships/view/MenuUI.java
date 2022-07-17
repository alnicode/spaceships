package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
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
        var response = MenuConstants.DEFAULT_RESPONSE;

        do {
            response = UtilsUI.numericResponse(menu());

            goTo(response);
        } while (response != MenuConstants.DEFAULT_RESPONSE);
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

    /**
     * Got to the next menu or close the application.
     *
     * @param response the selected option.
     */
    private static void goTo(int response) {
        if (response == MenuEnum.REGISTER.getOption()) {
            RegisterUI.showMenu();
        } else if (response == MenuEnum.CONSULT.getOption()) {
            System.out.println("2");
        } else if (response == MenuEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println("\nNot valid");
            showMenu();
        }
    }

}
