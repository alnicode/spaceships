package com.alnicode.spaceships.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The thrust spaceship menu options.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum ThrustSpaceshipEnum {
    ROBOTIC(1, "Robotic Spaceship."),
    SHUTTLE(2, "Space Shuttle.");

    private final int option;
    private final String message;
}
