package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
import com.alnicode.spaceships.util.enums.RegisterEnum;
import java.util.Arrays;

/**
 * The register UI main menu.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class RegisterUI {

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
     * Build the register main menu through enumeration and loops.
     *
     * @return the register menu.
     */
    private static String menu() {
        final var menu = new StringBuilder();

        menu.append("\n# ----- REGISTER MENU ----- #\n\n").append("What do you have to register?\n\n");

        Arrays.stream(RegisterEnum.values())
                .forEach(option -> menu.append(option.getOption())
                        .append(". ").append(option.getMessage())
                        .append("\n"));

        return menu.toString();
    }

    /**
     * Go to the next or previous menu.
     *
     * @param response the selected option.
     */
    private static void goTo(int response) {
        if (response == RegisterEnum.INVENTORY.getOption()) {
            System.out.println("inventory");
        } else if (response == RegisterEnum.SPACECRAFT.getOption()) {
            SpacecraftUI.showMenu();
        } else if (response == RegisterEnum.BACK.getOption()) {
            MenuUI.showMenu();
        } else if (response == RegisterEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println("\nNot valid.");
            showMenu();
        }
    }

}
