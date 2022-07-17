package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
import com.alnicode.spaceships.util.enums.SpacecraftEnum;
import java.util.Arrays;

/**
 * The spacecraft main menu.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class SpacecraftUI {

    /**
     * Show the spacecraft main menu options.
     */
    public static void showMenu() {
        var response = MenuConstants.DEFAULT_RESPONSE;

        do {
            response = UtilsUI.numericResponse(menu());

            goTo(response);
        } while (response != MenuConstants.DEFAULT_RESPONSE);
    }

    /**
     * @return the available options.
     */
    private static String menu() {
        final var menu = new StringBuilder();

        menu.append("\n# ----- SPACECRAFT MAIN MENU ----- #\n\n").append("What type of spacecraft do you want to register?\n\n");

        Arrays.stream(SpacecraftEnum.values())
                .forEach(option -> menu.append(option.getOption())
                        .append(". ")
                        .append(option.getMessage())
                        .append("\n"));

        return menu.toString();
    }

    /**
     * Go to the next or previous menu.
     *
     * @param response the selected option.
     */
    private static void goTo(int response) {
        if (response == SpacecraftEnum.MANNED.getOption()) {
            System.out.println("manned spaceship");
        } else if (response == SpacecraftEnum.THRUST.getOption()) {
            System.out.println("thrust spaceship");
        } else if (response == SpacecraftEnum.BACK.getOption()) {
            RegisterUI.showMenu();
        } else if (response == SpacecraftEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println("\ninvalid\n");
            showMenu();
        }
    }

}
