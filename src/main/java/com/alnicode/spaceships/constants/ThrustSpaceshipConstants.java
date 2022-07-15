package com.alnicode.spaceships.constants;

/**
 * The {@code ThrustSpaceship} constants.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see com.alnicode.spaceships.constants.SpacecraftConstants
 */
public interface ThrustSpaceshipConstants extends SpacecraftConstants {
    int THRUST_LENGTH = 30;
    String MAP_THRUST = "java(request.getThrust() + \" \" + request.getThrustMeasure())";
}
