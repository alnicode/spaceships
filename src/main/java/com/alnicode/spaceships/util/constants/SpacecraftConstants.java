package com.alnicode.spaceships.util.constants;

/**
 * The {@code Spacecraft} constants.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 */
public interface SpacecraftConstants {
    int WEIGHT_LENGTH = 30;
    int HEIGHT_LENGTH = 30;
    int MISSION_LENGTH = 140;
    int FUEL_LENGTH = 120;
    int STATE_LENGTH = 120;
    int NAME_LENGTH = 200;
    String MAP_WEIGHT = "java(request.getWeight() + \" \" + request.getWeightMeasure())";
    String MAP_HEIGHT = "java(request.getHeight() + \" \" + request.getHeightMeasure())";
}
