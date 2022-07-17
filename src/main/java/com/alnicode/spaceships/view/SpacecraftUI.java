package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
import com.alnicode.spaceships.util.enums.menu.RegisterSpacecraftEnum;
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
     * Show the spacecraft main register menu options.
     */
    public static void showRegisterMenu() {
        var response = MenuConstants.DEFAULT_RESPONSE;

        do {
            response = UtilsUI.numericResponse(registerMenu());

            registerGoTo(response);
        } while (response != MenuConstants.DEFAULT_RESPONSE);
    }

    /**
     * @return the available register options.
     */
    private static String registerMenu() {
        final var menu = new StringBuilder();

        menu.append("\n# ----- SPACECRAFT MAIN MENU ----- #\n\n").append("What type of spacecraft do you want to register?\n\n");

        Arrays.stream(RegisterSpacecraftEnum.values())
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
        if (response == RegisterSpacecraftEnum.MANNED.getOption()) {
            System.out.println("manned spaceship");
        } else if (response == RegisterSpacecraftEnum.THRUST.getOption()) {
            ThrustSpaceshipUI.showRegisterMenu();
        } else if (response == RegisterSpacecraftEnum.BACK.getOption()) {
            RegisterUI.showMenu();
        } else if (response == RegisterSpacecraftEnum.EXIT.getOption()) {
            UtilsUI.close();
        } else {
            System.out.println(MenuConstants.NOT_VALID);
            showRegisterMenu();
        }
    }

}
