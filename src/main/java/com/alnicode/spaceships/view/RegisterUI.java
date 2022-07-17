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

    private static void goTo(int response) {
        switch (response) {
            case 1:
                System.out.println("inventory");
                break;
            case 2:
                SpacecraftUI.showMenu();
                break;
            case 3:
                MenuUI.showMenu();
                break;
            case 0:
                UtilsUI.close();
                break;
            default:
                System.out.println("\nnot valid\n");
                showMenu();
                break;
        }
    }

}
