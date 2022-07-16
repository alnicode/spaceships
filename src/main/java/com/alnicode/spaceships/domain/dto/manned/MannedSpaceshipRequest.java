package com.alnicode.spaceships.domain.dto.manned;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import lombok.Getter;

/**
 * The {@code MannedSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class MannedSpaceshipRequest extends SpacecraftRequest {

    private int earthOrbit;
    private String earthOrbitMeasure;
    private int peopleCapacity;

}
