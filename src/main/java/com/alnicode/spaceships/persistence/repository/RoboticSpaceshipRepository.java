package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.RoboticSpaceship;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * The {@link RoboticSpaceship} repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface RoboticSpaceshipRepository extends ThrustSpaceshipRepository<RoboticSpaceship> {

    /**
     * Find a robotic spaceship by the speed.
     *
     * @param speed the speed to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<RoboticSpaceship>> findBySpeed(String speed);

    /**
     * Find a robotic spaceship by the destiny orbit.
     *
     * @param destinyOrbit the destiny orbit to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<RoboticSpaceship>> findByDestinyOrbit(String destinyOrbit);

}
