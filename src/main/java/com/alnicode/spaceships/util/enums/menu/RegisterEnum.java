package com.alnicode.spaceships.util.enums.menu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * The register UI options.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public enum RegisterEnum {
    INVENTORY(1, "Inventory."),
    SPACECRAFT(2, "Spacecraft."),
    BACK(3, "Back."),
    EXIT(0, "Exit.");

    private final int option;
    private final String message;
}
