package com.alnicode.spaceships.model.domain.dto.robotic;

import com.alnicode.spaceships.model.domain.dto.thrust.ThrustSpaceshipRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code RoboticSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Getter
@Setter
public class RoboticSpaceshipRequest extends ThrustSpaceshipRequest {

    private double speed;
    private String speedMeasure;
    private String destinyOrbit;
    private boolean imageStatus;

}
