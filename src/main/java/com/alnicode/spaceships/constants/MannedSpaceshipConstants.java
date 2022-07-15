package com.alnicode.spaceships.constants;

/**
 * The {@code MannedSpaceship} constants.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 * @see com.alnicode.spaceships.constants.SpacecraftConstants
 */
public interface MannedSpaceshipConstants extends SpacecraftConstants {
    int EARTH_ORBIT_LENGTH = 30;
    int PEOPLE_CAPACITY = 10;
    String MAP_EARTH_ORBIT = "java(request.getEarthOrbit() + \" \" + request.getEarthOrbitMeasure())";
    String MAP_PEOPLE_CAPACITY = "java(request.getPeopleCapacity() + \" persons\")";
}
