package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.MannedSpaceship;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

/**
 * The {@link MannedSpaceship} repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface MannedSpaceshipRepository extends SpacecraftRepository<MannedSpaceship> {

    /**
     * Find a manned spaceship by the earth orbit.
     *
     * @param earthOrbit the earth orbit to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<MannedSpaceship>> findByEarthOrbit(String earthOrbit);

    /**
     * Find a manned spaceship by the people capacity.
     *
     * @param peopleCapacity the capacity to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<MannedSpaceship>> findByPeopleCapacity(String peopleCapacity);

}
