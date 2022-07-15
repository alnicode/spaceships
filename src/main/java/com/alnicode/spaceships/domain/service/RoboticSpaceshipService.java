package com.alnicode.spaceships.domain.service;

import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipResponse;
import com.alnicode.spaceships.persistence.entity.RoboticSpaceship;
import java.util.List;
import java.util.Optional;

/**
 * The robotic spaceship service template.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface RoboticSpaceshipService extends ThrustSpaceshipService<RoboticSpaceship, RoboticSpaceshipRequest, RoboticSpaceshipResponse> {

    /**
     * Find a robotic spaceship by the speed.
     *
     * @param speed the speed to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<RoboticSpaceshipResponse>> findBySpeed(String speed);

    /**
     * Find a robotic spaceship by the destiny orbit.
     *
     * @param destinyOrbit the destiny orbit to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<RoboticSpaceshipResponse>> findByDestinyOrbit(String destinyOrbit);

}
