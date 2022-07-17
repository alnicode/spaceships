package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
import com.alnicode.spaceships.util.enums.menu.RegisterThrustSpaceshipEnum;
import java.util.Arrays;

/**
 * The thrust spaceship menu.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class ThrustSpaceshipUI {

    /**
     * Show the thrust spaceship menu.
     */
    public static void showMenu() {
        var response = MenuConstants.DEFAULT_RESPONSE;

        do {
            response = UtilsUI.numericResponse(menu());

            goTo(response);
        } while (response != MenuConstants.DEFAULT_RESPONSE);
    }

    /**
     * @return the menu.
     */
    private static String menu() {
        final var menu = new StringBuilder();

        menu.append("\n# ----- THRUST SPACESHIP MAIN MENU ----- #\n\n");
        menu.append("What type of thrust spaceship do you want to register?\n\n");

        Arrays.stream(RegisterThrustSpaceshipEnum.values())
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
        if (response == RegisterThrustSpaceshipEnum.ROBOTIC.getOption()) {
            System.out.println("robotic");
        } else if (response == RegisterThrustSpaceshipEnum.SHUTTLE.getOption()) {
            System.out.println("shuttle");
        } else if (response == RegisterThrustSpaceshipEnum.BACK.getOption()) {
            SpacecraftUI.showMenu();
        } else if (response == RegisterThrustSpaceshipEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println(MenuConstants.NOT_VALID);
            showMenu();
        }
    }

}
