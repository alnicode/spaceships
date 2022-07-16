package com.alnicode.spaceships.domain.dto.thrust;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The {@code ThrustSpaceship} request model dto.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@NoArgsConstructor
@Setter
@Getter
public class ThrustSpaceshipRequest extends SpacecraftRequest {

    private double thrust;
    private String thrustMeasure;

}
