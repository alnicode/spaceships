package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The spacecraft UI menu options.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum SpacecraftEnum {
    MANNED(1, "Manned Spaceship."),
    THRUST(2, "Thrust Spaceship."),
    BACK(3, "Back."),
    EXIT(0, "Exit");

    private final int option;
    private final String message;
}
