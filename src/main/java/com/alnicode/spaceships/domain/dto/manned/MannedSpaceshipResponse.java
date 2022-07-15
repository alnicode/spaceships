package com.alnicode.spaceships.domain.dto.manned;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftResponse;
import lombok.Getter;

/**
 * The {@code MannedSpaceship} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class MannedSpaceshipResponse extends SpacecraftResponse {

    private final String earthOrbit;
    private final String peopleCapacity;

    public MannedSpaceshipResponse(final long id, final String weight, final String height, final String mission, final String name,
                                   final String fuel, final String state, final String earthOrbit, final String peopleCapacity) {
        super(id, name, weight, height, mission, fuel, state);
        this.earthOrbit = earthOrbit;
        this.peopleCapacity = peopleCapacity;
    }

}
