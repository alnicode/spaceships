package com.alnicode.spaceships.util.constants;

/**
 * The {@code RoboticSpaceship} constants.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see ThrustSpaceshipConstants
 * @see SpacecraftConstants
 */
public interface RoboticSpaceshipConstants extends ThrustSpaceshipConstants {
    int SPEED_LENGTH = 20;
    int DESTINY_ORBIT_LENGTH = 80;
    String MAP_SPEED = "java(request.getSpeed() + \" \" + request.getSpeedMeasure())";
}
