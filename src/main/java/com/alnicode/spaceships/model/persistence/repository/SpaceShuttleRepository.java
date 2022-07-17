package com.alnicode.spaceships.model.persistence.repository;

import com.alnicode.spaceships.model.persistence.entity.SpaceShuttle;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * The {@link SpaceShuttle} repository.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface SpaceShuttleRepository extends ThrustSpaceshipRepository<SpaceShuttle> {

    /**
     * Find a space shuttle by the transport.
     *
     * @param transport the transport to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<SpaceShuttle>> findByTransport(String transport);

    /**
     * Find a space shuttle by the power.
     *
     * @param power the power to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<SpaceShuttle>> findByPower(String power);

}
