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
     * Show the thrust spaceship register menu.
     */
    public static void showRegisterMenu() {
        var response = MenuConstants.DEFAULT_RESPONSE;

        do {
            response = UtilsUI.numericResponse(registerMenu());

            registerGoTo(response);
        } while (response != MenuConstants.DEFAULT_RESPONSE);
    }

    /**
     * @return the register menu.
     */
    private static String registerMenu() {
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
     * Go to the next or previous register menu.
     *
     * @param response the selected option.
     */
    private static void registerGoTo(int response) {
        if (response == RegisterThrustSpaceshipEnum.ROBOTIC.getOption()) {
            System.out.println("robotic");
        } else if (response == RegisterThrustSpaceshipEnum.SHUTTLE.getOption()) {
            System.out.println("shuttle");
        } else if (response == RegisterThrustSpaceshipEnum.BACK.getOption()) {
            SpacecraftUI.showRegisterMenu();
        } else if (response == RegisterThrustSpaceshipEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println(MenuConstants.NOT_VALID);
            showRegisterMenu();
        }
    }

}
