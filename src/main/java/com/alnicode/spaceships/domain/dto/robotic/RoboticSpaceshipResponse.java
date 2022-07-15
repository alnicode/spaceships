package com.alnicode.spaceships.domain.dto.robotic;

import com.alnicode.spaceships.domain.dto.thrust.ThrustSpaceshipResponse;
import lombok.Getter;

/**
 * The {@code RoboticSpaceship} response model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Getter
public class RoboticSpaceshipResponse extends ThrustSpaceshipResponse {

    private final String speed;
    private final String destinyOrbit;

    public RoboticSpaceshipResponse(final long id, final String weight, final String height, final String mission,
                                    final String fuel, final String state, final String thrust, final String speed,
                                    final String destinyOrbit, final String name) {
        super(id, name, weight, height, mission, fuel, state, thrust);
        this.speed = speed;
        this.destinyOrbit = destinyOrbit;
    }

}
