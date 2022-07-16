package com.alnicode.spaceships.view;

import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 * The utils for UI.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Component
public class UtilsUI {

    /**
     * Show the message and get the response.
     *
     * @param message the message to show.
     * @return the user response.
     */
    public String response(String message) {
        final var sc = new Scanner(System.in);

        System.out.print(message + "\n -> ");
        final var response = sc.nextLine();

        sc.close();

        return response;
    }

    /**
     * Show a message and get the response integer.
     *
     * @param message the message to show.
     * @return an integer as a response.
     */
    public int numericResponse(String message) {
        try {
            return Integer.parseInt(response(message));
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

}
