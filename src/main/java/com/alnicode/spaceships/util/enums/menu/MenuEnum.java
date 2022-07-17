package com.alnicode.spaceships.util.enums.menu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The options to show and use on the main menu.l
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum MenuEnum {
    REGISTER(1, "Register inventories and spaceships."),
    CONSULT(2, "Search or consult inventories and spaceships."),
    EXIT(3, "Exit");

    private final int option;
    private final String message;
}
