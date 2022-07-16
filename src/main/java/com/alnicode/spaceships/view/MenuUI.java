package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.enums.MenuOption;
import java.util.Arrays;
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
            response = utilsUI.numericResponse(menu());

            goTo(response);
        } while (response != 0);
    }

    /**
     * Build the menu through enumeration and loops.
     *
     * @return the main menu.
     */
    private String menu() {
        final var menu = new StringBuilder();

        menu.append("\nWelcome!\n").append("What do you want to do?\n\n");

        Arrays.stream(MenuOption.values())
                .forEach(option -> menu.append(option.getOption())
                        .append(". ").append(option.getMessage())
                        .append("\n"));

        return menu.toString();
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
