package com.alnicode.spaceships.domain.dto.thrust;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftResponse;
import lombok.Getter;

/**
 * The {@code ThrustSpaceship} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class ThrustSpaceshipResponse extends SpacecraftResponse {

    private final String thrust;

    public ThrustSpaceshipResponse(final long id, final String weight, final String height, final String mission,
                                   final String fuel, final String state, final String thrust, final String name) {
        super(id, name, weight, height, mission, fuel, state);
        this.thrust = thrust;
    }

}
