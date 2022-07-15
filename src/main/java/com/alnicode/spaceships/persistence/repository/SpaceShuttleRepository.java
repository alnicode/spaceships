package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.SpaceShuttle;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The {@link SpaceShuttle} repository.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface SpaceShuttleRepository extends JpaRepository<SpaceShuttle, Long> {

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

    /**
     * Find a space shuttle by the thrust.
     *
     * @param thrust the thrust to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<SpaceShuttle>> findByThrust(String thrust);

}
