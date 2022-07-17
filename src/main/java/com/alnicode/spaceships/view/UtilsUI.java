package com.alnicode.spaceships.view;

import com.alnicode.spaceships.util.constants.MenuConstants;
import java.util.Scanner;

/**
 * The utils for UI.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class UtilsUI {

    private static final Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    /**
     * Show the message and get the response.
     *
     * @param message the message to show.
     * @return the user response.
     */
    public static String response(String message) {
        System.out.print(message + "\n -> ");
        return sc.nextLine();
    }

    /**
     * Show a message and get the response integer.
     *
     * @param message the message to show.
     * @return an integer as a response.
     */
    public static int numericResponse(String message) {
        try {
            return Integer.parseInt(response(message));
        } catch (NumberFormatException ex) {
            return MenuConstants.DEFAULT_RESPONSE;
        }
    }

    /**
     * Close the scanner and the application.
     */
    public static void close() {
        System.out.println("\nBye bye\n");
        sc.close();
        System.exit(0);
    }

}
