package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.ThrustSpaceship;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * The thrust spaceship repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface ThrustSpaceshipRepository<Entity extends ThrustSpaceship> extends SpacecraftRepository<Entity> {

    /**
     * Find an element by the thrust.
     *
     * @param thrust the thrust to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<Entity>> findByThrust(String thrust);

}
